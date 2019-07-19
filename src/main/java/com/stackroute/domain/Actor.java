package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

//	@Value annotation - to set value for the properties
	@Value("Vijay")
	private String name;
	
	@Value("male")
	private String gender;
	
	@Value("35")
	private int age;
	
//	getter methods
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
}
