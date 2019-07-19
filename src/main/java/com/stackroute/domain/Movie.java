package com.stackroute.domain;

public class Movie {

//	declaration
	private Actor actor;
	
//	default constructor
	public Movie() {
	}

//	parameterized constructor
	public Movie(Actor actor) {
		this.actor = actor;
	}

//	display actor info
	public void display()
	{
		System.out.println("Actor Name: "+actor.getName()+" Gender: "+actor.getGender()+" Age: "+actor.getAge() );
	}
}
