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
	
//	Actor Bean
	@Bean
	public Actor actorObj (){
		return new Actor("sivakarthikeyan","male",30);
	}
	
//	BeanPostProcessorDemoBean Bean
	@Bean
	public BeanPostProcessorDemoBean beanPostProcessorDemo(){
		return new BeanPostProcessorDemoBean();
	}
	
}
