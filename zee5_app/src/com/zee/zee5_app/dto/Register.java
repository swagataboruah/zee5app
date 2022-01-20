package com.zee.zee5_app.dto;

import lombok.Data;

@Data
public class Register {

	private static final String Register = null;
	private String id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	// introducing EDC (explicit default constructor)
	// if we have IDC, why do we need EDC? ---> If there is any kind of customization of object then it's better to use EDC/PC or both as per need
	public Register() {
		System.out.println("Explicit default constructor");
	}
	
		
}
	
