package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("consInjection.xml");

//		Person a = (Person) context.getBean("person");
//
//		System.out.println(a);
//		
		Addition ad = (Addition) context.getBean("addition");
//		System.out.println(ad);
		
	}

}
