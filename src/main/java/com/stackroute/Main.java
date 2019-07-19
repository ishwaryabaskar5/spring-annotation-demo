package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
	public static void main( String[] args )
	{
//		ApplicationContext object
		ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.domain");
		
//		Movie object
		Movie movie = context.getBean("movieObj",Movie.class);
		movie.display();
		
//		BeanPostProcessorDemoBean object
		BeanPostProcessorDemoBean beanPostProcessorDemoBean =  (BeanPostProcessorDemoBean) context.getBean("beanPostProcessorDemo");
	}
}

	

