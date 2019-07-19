package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
		public static void main( String[] args )
		{
//			create object for ApplicationContext container
			ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.domain");
//			get the movieBean from the container
			Movie movie1 = context.getBean("movieBean",Movie.class);
//			call the display() of Movie class
			movie1.display();
			
//			create object for BeanFactory container
			BeanFactory factory = new AnnotationConfigApplicationContext("com.stackroute.domain");
//			get the movieBean from the container
			Movie movie2 = factory.getBean("movieBean",Movie.class);
//			call the display() of Movie class
			movie2.display();
			
			
		}

}
