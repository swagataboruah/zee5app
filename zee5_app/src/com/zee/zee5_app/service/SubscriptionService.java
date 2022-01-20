package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Register;

import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.repository.SubscriptionRepository;


public class SubscriptionService {

	private SubscriptionRepository repository1 = SubscriptionRepository.getInstance();
	private SubscriptionService() {
		// TODO Auto-generated constructor stub
	}
		
	private static SubscriptionService service = null; 
	public static SubscriptionService getInstance() {
				
			if(service==null)
				service = new SubscriptionService();
			return service; 		
	}
	
	// CONSUMING GET ALL SUBSCRIPTION FROM UserRepository
	public Subscription[] getAllSubs() {
		return this.repository1.getAllSubs();
	}


	// CONSUMING GET SUBSCRIPTION BY ID FROM UserRepository
	 public Subscription getSubsById(String id) {
     	return this.repository1.getSubsById(id);
     }
     
	// CONSUMING ADD SUBSCRIPTION FROM UserRepository
     public String addSubs(Subscription subscription) {
	    return this.repository1.addSubs(subscription);
     }

   // CONSUMING DELETE SUBSCRIPTION FROM UserRepository
     public String delSubs(String id, Subscription subscriptions1) {
    	 return this.repository1.delSubs(id, subscriptions1);
     }
     
   // CONSUMING UPDATE SUBSCRIPTION FROM UserRepository
     public String updateSubs(String id, Subscription subscription1) {
     return this.repository1.updateSubs(id, subscription1);
     }
}
