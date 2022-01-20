package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Subscription;

public class SubscriptionRepository2 {

	//ADD NEW
	private Subscription[] subscriptions = new Subscription[10];
	private SubscriptionRepository() {
		
	}
	private static int count=-1;
	public String addSubs(Subscription subscription) {
		if(count==subscriptions.length-1) {
			Subscription temp[] = new Subscription[subscriptions.length*2];
			System.arraycopy(subscription, 0, temp, 0, subscriptions.length);
			subscriptions = temp;
			subscriptions[++count] = subscription; 
			return "subscription added";
		}
		subscriptions[++count] = subscription;
		return "subscription added";
	}
	
	
	//DELETE
	public String delSubs(String id, Subscription subscriptions1) {
		Subscription temp[] = new Subscription[subscriptions.length-1];
		for(Subscription subscription : subscriptions) {
			if(subscriptions1.!= id) {
				System.arraycopy(subscription, 0, temp, 0, subscriptions.length-1);
			}
		
		}
	}
	
	
	//UPDATE
	public String updateSubs(String id, Subscription subscription1) {
		int count1 = 0;
		for(Subscription subscription : subscriptions) {
			if(subscription!=null && subscription.getSubId().equals(id)) {
				subscriptions[count1] = subscription1;
				return("updated");
			}
		}
		count1++;
	}
	
	
	//GET ALL
	public Subscription[] getAllSubs() {
		return subscriptions;
	}
	
	
	//GET ALL BY ID
	public Subscription getSubsById(String id) {
		for (Subscription register : subscriptions) {
			if(subscriptions!=null && subscription.getSubId().equals(Id) ) {
				return subscription;
			}
		}
		return null;		
	}
	
	
	
	private static SubscriptionRepository subscriptionRepository;
	public static SubscriptionRepository getInstance() {
		if(subscriptionRepository==null)
			subscriptionRepository = new SubscriptionRepository();
		return subscriptionRepository; 
	}
	
}
