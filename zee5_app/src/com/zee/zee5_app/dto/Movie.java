package com.zee.zee5_app.dto;
import lombok.Data;
@Data
public class Movie {
	private String Name;
	private String Cat;
	private String lang;
	private int DateOfRel;
	private String Id;
	
	public void Movie() {
		System.out.println("This is EDC for movie");
	}

}
