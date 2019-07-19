package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass {

//	Movie Bean
	@Bean
	public Movie movieObj (){
		return new Movie(actorObj());
	}

//	Actor bean
	@Bean
	public Actor actorObj (){
		return new Actor("sivakarthikeyan","male",30);
	}
	
//	BeanLifecycleDemoBean bean with customInit and customDestroy method
	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
	public BeanLifecycleDemoBean beanLifeCycle() {
		return new BeanLifecycleDemoBean();
	}
	
}
