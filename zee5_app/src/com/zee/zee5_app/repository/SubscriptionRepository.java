package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Subscription;

public interface SubscriptionRepository {

	public String addSubs(Subscription subscription);
	public String delSubs(String id, Subscription subscriptions1);
	public String updateSubs(String id, Subscription subscription1);
	public Subscription[] getAllSubs();
	public Subscription getSubsById(String id);
}
