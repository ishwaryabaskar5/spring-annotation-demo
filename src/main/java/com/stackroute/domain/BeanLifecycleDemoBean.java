package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements DisposableBean, InitializingBean {
	
//	overrides afterPropertiesSet() of InitializingBean interface
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method");
	}

//	overrides destroy() of DisposableBean interface
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}
	
//	customInit()
	public void customInit(){
		System.out.println("Inside customInit method");
	}
	
//	customDestroy()
	public void customDestroy(){
		System.out.println("Inside customDestroy method");
	}
}