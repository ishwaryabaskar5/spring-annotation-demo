package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
	
	@Bean
	public Movie movieBean (){
		return new Movie(actorBean());
	}
	
	@Bean
	public Actor actorBean (){
		return new Actor();
	}

}
