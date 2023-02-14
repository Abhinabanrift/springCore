package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssign {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("refAssign.xml");
//		Student student = (Student) context.getBean("student");
//		System.out.println(student);
//		System.out.println("Student Name: " + student.getName());
//		System.out.println("Address: " + student.getAddress().getStreet() + ", " + student.getAddress().getCity() + ", "
//				+ student.getAddress().getState() + ", " + student.getAddress().getCountry());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Student.class);
		context.register(Address.class);
		context.refresh();
		Student student = context.getBean(Student.class);
//        student.re
		System.out.println(student);
	}
}
