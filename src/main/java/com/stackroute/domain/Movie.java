package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

//	Autowired above the property
//	@Autowired
	private Actor actor;
	
//	constructor
	public Movie() {
	}
	public Movie(Actor actor) {
		this.actor = actor;
		System.out.println("Constructor Autowired");
	}

//	Autowired setter method
	@Autowired
	public void setActor(Actor actor) {
		this.actor = actor;
		System.out.println("Inside setter method");
		
	}
	
//	display actor info
	public void display()
	{
		System.out.println("Actor Name: "+actor.getName()+" Gender: "+actor.getGender()+" Age: "+actor.getAge() );
	}
}
