package com.zee.zee5_app.dto;
import lombok.Data;
@Data
public class Series {
	private String Name;
	private int DateOfRel;
	private String Cat;
	private String lang;
	private String Id;
	
	public void Series() {
		System.out.println("This is EDC for series");
	}
}
