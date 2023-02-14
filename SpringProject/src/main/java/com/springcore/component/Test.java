package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
//		Student st = context.getBean("st", Student.class);
		Person pe = context.getBean("per", Person.class);
//		System.out.println(st);
		System.out.println(pe);
	}

}
