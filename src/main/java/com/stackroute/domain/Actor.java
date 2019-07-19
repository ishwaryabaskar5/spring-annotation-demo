package com.stackroute.domain;

public class Actor {

//	declaration
	private String name;
	private String gender;
	private int age;
	
//	constructor
	public Actor(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
//	getter method
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
