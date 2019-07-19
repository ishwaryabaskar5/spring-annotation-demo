package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// Task 6
public class BeanPostProcessorDemoBean implements BeanPostProcessor {

//	overrides postProcessBeforeInitialization() of BeanPostProcessor interface
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside postProcessBeforeInitialization method");
		return bean;
	}
	
//	overrides postProcessAfterInitialization() of BeanPostProcessor interface
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside postProcessAfterInitialization method");
		return bean;
	}
}