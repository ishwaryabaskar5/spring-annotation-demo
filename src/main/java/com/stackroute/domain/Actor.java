package com.stackroute.domain;

public class Actor {

//	property declaration
	private String name;
	private String gender;
	private int age;
	
//	constructor
	public Actor(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
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
