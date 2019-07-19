package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

//	Movie bean
	@Bean
	public Movie movieBean (){
		Movie movie = new Movie();
//		call setter method
		movie.setActor(actorBean());
		return movie;
	}
	
//	Actor bean
	@Bean
	public Actor actorBean (){
		return new Actor();
	}

}
