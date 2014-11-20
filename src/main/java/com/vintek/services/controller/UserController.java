package com.vintek.services.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//import javax.faces.event.ActionEvent;
//import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.ws.rs.core.Response;

import localdomain.localhost.domain.Country;

import com.vintek.database.model.user.Group;
import com.vintek.database.model.user.Privilege;
import com.vintek.database.model.user.User;
import com.vintek.database.service.MojaveDB;
import com.vintek.services.controller.UserRegistration;
import com.vintek.services.rest.ServiceException;
import com.vintek.util.Encrypter;
//import com.vintek.services.security.Secure;
//import com.vintek.services.security.SecurityManager;
//import com.vintek.services.security.SecurityToken;

// The @Model stereotype is a convenience mechanism to make this a request-scoped bean that has an EL name
// Read more about the @Model stereotype in this FAQ:
// http://sfwk.org/Documentation/WhatIsThePurposeOfTheModelAnnotation
@Model
//@Secure
public class UserController {

   @Inject
   private Logger log;

   @Inject
   private UserRegistration userRegistration;

   @Inject
   private MojaveDB mojaveDB;
   
//	@Inject
//	private SecurityManager securityManager;
   
   @Inject
   private Validator validator;
   
//   @Inject
//   UserRegistration registration;
   
   private User currentUser;   
   private List<String> groupsAvailable;
   private List<String> orgsAvailable;
   private List<String> orgsAssigned;
   private List<String> selectStandardPrivileges;
   private List<String> selectAdvancedPrivileges;
   private List<String> selectSpecialPrivileges;
   private List<String> selectInternalPrivileges;
   private List<Boolean> selectedStandardPrivileges;
   private List<Boolean> selectedAdvancedPrivileges;
   private List<Boolean> selectedSpecialPrivileges;
   private List<Boolean> selectedInternalPrivileges;
   private static final String SESSION_USER = "user";
   
   private static Map<String, Object> timeZones;
   static {
	   timeZones = new LinkedHashMap<String, Object>();
	   timeZones.put("EST5EDT","EST5EDT");
	   timeZones.put("CST6CDT","CST6CDT");
	   timeZones.put("MST7MDT","MST7MDT");
	   timeZones.put("MST","MST");
	   timeZones.put("PST8PDT","PST8PDT");
	   timeZones.put("US/Alaska","US/Alaska");
	   timeZones.put("AST","AST");
	   timeZones.put("HST","HST");	   
   }
   
   @PostConstruct
   public void init() {
	   initNewUser();
/*	   
	   setGroupsAvailable(retriveGroupsAvailable());
	   setOrgsAvailable(retriveOrgsAvailable());
	   setOrgsAssigned(retriveOrgsAssigned());
	   setSelectStandardPrivileges(retrievePrivileges("1"));
	   setSelectAdvancedPrivileges(retrievePrivileges("2"));
	   setSelectSpecialPrivileges(retrievePrivileges("3"));
	   setSelectInternalPrivileges(retrievePrivileges("4"));
*/
	   selectedStandardPrivileges = new ArrayList<Boolean>();
	   selectedAdvancedPrivileges = new ArrayList<Boolean>();
	   selectedSpecialPrivileges = new ArrayList<Boolean>();
	   selectedInternalPrivileges = new ArrayList<Boolean>();
   }
   
   public void initNewUser() {
	   setCurrentUser(new User());
   }
   
	public List<User> getAllUsers() throws NoResultException {
		final List<User> users = mojaveDB.findWithNamedQuery("User.ALL");      
		return users;
	}
   
	public User getUser(int id) throws NonUniqueResultException, EntityNotFoundException {
		return (User) mojaveDB.find(User.class, id);
	}
	
	public User getUser(String userId) throws NonUniqueResultException, EntityNotFoundException {       
		return (User) mojaveDB.findWithNamedQuerySingleResult("User.ByUserId", userId);
	}		
   
	public User createUser(User user) throws ConstraintViolationException, ValidationException, ServiceException {
//      try {
        validateUser(user);
        
		if (userIdAlreadyExists(user.getUserID())) {
			throw new ValidationException("Unique UserId Violation");
		}
        
        User newUser = null;
        try {
        	newUser = mojaveDB.create(user);
        	userRegistration.register(newUser);  // add the user in the cache
        } catch (Exception e) {
        	throw new ServiceException(e);
        }
        return newUser;
//    } catch (ConstraintViolationException ce) {   			// bean validation issues
//        builder = createViolationResponse(ce.getConstraintViolations());
//    } catch (ValidationException e) {						// unique constrain violation 
//        Map<String, String> responseObj = new HashMap<String, String>();
//        responseObj.put("email", "Email taken");
//        builder = Response.status(Response.Status.CONFLICT).entity(responseObj);
//    } catch (Exception e) {									// generic exceptions 
//        Map<String, String> responseObj = new HashMap<String, String>();
//        responseObj.put("error", e.getMessage());
//        builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
//    }
	}

	   /**
	    * <p>
	    * Validates the given User variable and throws validation exceptions based on the type of error. If the error is standard
	    * bean validation errors then it will throw a ConstraintValidationException with the set of the constraints violated.
	    * </p>
	    * <p>
	    * If the error is caused because an existing member with the same userId is registered it throws a regular validation
	    * exception so that it can be interpreted separately.
	    * </p>
	    * 
	    * @param user User to be validated
	    * @throws ConstraintViolationException If Bean Validation errors exist
	    * @throws ValidationException If member with the same email already exists
	    */
	   private void validateUser(User user) throws ValidationException {
	       Set<ConstraintViolation<User>> violations = validator.validate(user);
	       if (!violations.isEmpty()) {
	           throw new ConstraintViolationException(new HashSet<ConstraintViolation<?>>(violations));
	       }
	   }

	   /**
	    * Checks if a member with the same email address is already registered. This is the only way to easily capture the
	    * "@UniqueConstraint(columnNames = "email")" constraint from the User1 class.
	    * 
	    * @param email The email to check
	    * @return True if the email already exists, and false otherwise
	    */
	   public boolean userIdAlreadyExists(String userId) {
		   List<User> users = null;
	       try {
	    	   users = mojaveDB.findWithNamedQuery("User.ByUserId", userId);
	       } catch (NoResultException e) {
	           // ignore
	       }
	       return ((users != null) && (users.size()>0));
	   }

	public User update(User user) throws ValidationException, ServiceException {
        validateUser(user);
        User updatedUser = null;
        try {
        	updatedUser = mojaveDB.update(user);
        	userRegistration.register(updatedUser);  // add the user in the cache
        } catch (Exception e) {
        	throw new ServiceException(e);
        }
        return updatedUser;
	}

	public void delete(int id) throws ServiceException{
        try {
        	mojaveDB.delete(User.class, id);
        	userRegistration.deregister(id);  // remove the user in the cache
        } catch (Exception e) {
        	throw new ServiceException(e);
        }
	}
	
	
	
	
	
   public void changeStatus() {
	   System.out.println("changing status");
   }   
//   public void selectCurrentUser(ActionEvent e) {
//	   selectCurrentUser(Integer)e.getComponent().getAttributes().get("user_id"));
//   }
   public void selectCurrentUser(Integer user_id) {
	   //setCurrentUser((User)mojaveDB.find(User.class, user_id));
   }
   public void newUser() throws Exception {
	   
   }
   public void cloneUser() throws Exception {
	   
   }
   public void changePassword() throws Exception {
	   
   }
   public void save() throws Exception {
      userRegistration.register(currentUser);
//      facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registered!", "Registration successful"));
      initNewUser();
   }

   public Map<String, Object> getTimeZones() {
	   return timeZones;
   }

/*   
   private List<SelectItem> retriveGroupsAvailable() {
	   List<SelectItem> ga = new ArrayList<SelectItem>();
	   List<Group> groups = mojaveDB.findWithNamedQuery("Group.ALL");
	   for (Group group:groups) {
		   ga.add(new SelectItem(Integer.toString(group.getId()),group.getName()));
	   }
	   return ga;
   }   
   private List<SelectItem> retriveOrgsAvailable() {
	   List<SelectItem> oav = new ArrayList<SelectItem>();
	   oav.add(new SelectItem("2794","1 High Level Auto"));
	   oav.add(new SelectItem("2418","1199 SEIU FCU"));
	   oav.add(new SelectItem("4081","11th Street Auto Sales"));
	   oav.add(new SelectItem("3418","1ST BANK YUMA"));
	   oav.add(new SelectItem("3272","1ST CHOICE CREDIT UNION"));
	   oav.add(new SelectItem("4099","1st Colonial National Bank"));
	   oav.add(new SelectItem("4034","1st Financial Federal Credit Union"));
	   oav.add(new SelectItem("3621","1ST GATEWAY CREDIT UNION"));
	   oav.add(new SelectItem("2643","1st Summit Bank"));
	   oav.add(new SelectItem("3009","25th Street Auto Sales"));
	   oav.add(new SelectItem("4748","2nd Chance Financing"));
	   oav.add(new SelectItem("2819","30 West Auto Sales"));
	   return oav;
   }
   private List<SelectItem> retriveOrgsAssigned() {
	   List<SelectItem> oas = new ArrayList<SelectItem>();
	   oas.add(new SelectItem("3009","25th Street Auto Sales"));
	   oas.add(new SelectItem("4748","2nd Chance Financing"));
	   oas.add(new SelectItem("2819","30 West Auto Sales"));	   
	   return oas;
   }
   protected List<SelectItem> retrievePrivileges(String groupId) {
		List<Privilege> privileges = mojaveDB.findWithNamedQuery("Privilege.ByGroup", groupId);
		List<SelectItem> selectPrivileges = new ArrayList<SelectItem>();
		for (Privilege privilege:privileges) {
			selectPrivileges.add(new SelectItem(privilege.getPermissionName(), privilege.getDisplayName()));
		}
		return selectPrivileges;
   }   
*/


//	public List<SelectItem> getSelectAdvancedPrivileges() {
//		return selectAdvancedPrivileges;
//	}
//	
//	public void setSelectAdvancedPrivileges(List<SelectItem> selectAdvancedPrivileges) {
//		this.selectAdvancedPrivileges = selectAdvancedPrivileges;
//	}
//	
//	public List<SelectItem> getSelectSpecialPrivileges() {
//		return selectSpecialPrivileges;
//	}
//	
//	public void setSelectSpecialPrivileges(List<SelectItem> selectSpecialPrivileges) {
//		this.selectSpecialPrivileges = selectSpecialPrivileges;
//	}
//	
//	public List<SelectItem> getSelectInternalPrivileges() {
//		return selectInternalPrivileges;
//	}
//	
//	public void setSelectInternalPrivileges(List<SelectItem> selectInternalPrivileges) {
//		this.selectInternalPrivileges = selectInternalPrivileges;
//	}
//	
//	public List<SelectItem> getSelectStandardPrivileges() {
//		   return selectStandardPrivileges;
//	}
//	
//	public void setSelectStandardPrivileges(List<SelectItem> selectStandardPrivileges) {
//		this.selectStandardPrivileges = selectStandardPrivileges;
//	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public List<Boolean> getSelectedStandardPrivileges() {
		return selectedStandardPrivileges;
	}

	public void setSelectedStandardPrivileges(List<Boolean> selectedStandardPrivileges) {
		this.selectedStandardPrivileges = selectedStandardPrivileges;
	}

	public List<Boolean> getSelectedAdvancedPrivileges() {
		return selectedAdvancedPrivileges;
	}

	public void setSelectedAdvancedPrivileges(List<Boolean> selectedAdvancedPrivileges) {
		this.selectedAdvancedPrivileges = selectedAdvancedPrivileges;
	}

	public List<Boolean> getSelectedSpecialPrivileges() {
		return selectedSpecialPrivileges;
	}

	public void setSelectedSpecialPrivileges(List<Boolean> selectedSpecialPrivileges) {
		this.selectedSpecialPrivileges = selectedSpecialPrivileges;
	}

	public List<Boolean> getSelectedInternalPrivileges() {
		return selectedInternalPrivileges;
	}

	public void setSelectedInternalPrivileges(List<Boolean> selectedInternalPrivileges) {
		this.selectedInternalPrivileges = selectedInternalPrivileges;
	}
//	public List<SelectItem> getGroupsAvailable() {
//		return groupsAvailable;
//	}
//	public void setGroupsAvailable(List<SelectItem> groupsAvailable) {
//		this.groupsAvailable = groupsAvailable;
//	}
//	public List<SelectItem> getOrgsAvailable() {
//		return orgsAvailable;
//	}
//	public void setOrgsAvailable(List<SelectItem> orgsAvailable) {
//		this.orgsAvailable = orgsAvailable;
//	}
//	public List<SelectItem> getOrgsAssigned() {
//		return orgsAssigned;
//	}
//	public void setOrgsAssigned(List<SelectItem> orgsAssigned) {
//		this.orgsAssigned = orgsAssigned;
//	}


}
