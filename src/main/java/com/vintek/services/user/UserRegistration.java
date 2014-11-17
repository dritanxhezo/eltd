package com.vintek.services.user;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.vintek.database.model.user.User;
import com.vintek.database.service.MojaveDB;

// The @Stateless annotation eliminates the need for manual transaction demarcation
@Stateless
public class UserRegistration {

   @Inject
   private Logger log;

//   @Inject
//   private EntityManager em;
   @Inject
   private MojaveDB mojaveDB;

   @Inject
   private Event<User> userEventSrc;

   public void register(User user) throws Exception {
      log.info("Registering " + user.getName());
      //em.persist(user);
      userEventSrc.fire(user);
   }
   
   public void deregister(int id) throws Exception {
	      log.info("DeRegistering " + id);
	      //em.persist(user);
	      //userEventSrc.fire(user);
   }
}
