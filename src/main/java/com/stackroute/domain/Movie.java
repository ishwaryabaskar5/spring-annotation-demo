package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

//	declaration
	private Actor actorObj;

//	constructor
	public Movie() {
	}
	
	public Movie(Actor actorObj) {
		this.actorObj = actorObj;
	}
	
//	display actor info
	public void display()
	{
		System.out.println("Actor Name: "+ actorObj.getName()+" Gender: "+ actorObj.getGender()+" Age: "+ actorObj.getAge() );
	}
	
//	overriding setBeanFactory method of BeanFactoryAware interface
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Inside setBeanFactory method");
	}

//	overrides setBeanName method of BeanNameAware interface
	@Override
	public void setBeanName(String s) {
		System.out.println("Inside setBeanName method");
	}
	
//	overrides setApplicationContext method of ApplicationContextAware interface
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Inside setApplicationContext method");
	}
	
}