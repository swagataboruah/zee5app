package com.zee.zee5_app.dto;
import lombok.Data;
@Data
public class Subscription {
	private String SubType;
	private int DateofSub;
	private String SubStatus;
	private String SubPackCountry;
	private String SubPayMode;
	private String AutoRenew;
	private int ExpiryDate;
	private String SubId;
	
	public void Subscription() {
		System.out.println("This is EDC for subscription");
	}

	
}

