package com.vintek.services.user;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.vintek.database.model.user.User;
import com.vintek.database.service.MojaveDB;

@RequestScoped
public class UserListObserver {
//   @Inject
//   private EntityManager em;

	@Inject
	private MojaveDB mojaveDB;
	
	private List<User> users;

   // @Named provides access the return value via the EL variable name "user1s" in the UI (e.g., Facelets or JSP view)
   @Produces
   @Named
   public List<User> getUsers() {
      return users;
   }

   public void onUserListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final User user) {
      retrieveAllUsersOrderedByName();
   }

   @PostConstruct
   public void retrieveAllUsersOrderedByName() {
//      CriteriaBuilder cb = em.getCriteriaBuilder();
//      CriteriaQuery<User> criteria = cb.createQuery(User.class);
//      Root<User> user = criteria.from(User.class);
//      // Swap criteria statements if you would like to try out type-safe criteria queries, a new feature in JPA 2.0
//      // criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
//      criteria.select(user).orderBy(cb.asc(user.get("name")));
//      users = em.createQuery(criteria).getResultList();
	   users = null;//mojaveDB.findWithNamedQuery("User.ALL");
   }
}
