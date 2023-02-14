package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("lifeconfig.xml");
//		Item item1 = (Item) context.getBean("firstitem");
//		System.out.println(item1);
//		context.registerShutdownHook();
		
//		AbstractApplicationContext  context2 = new ClassPathXmlApplicationContext("lifeconfig.xml");
//		SecondItem item2 = (SecondItem) context2.getBean("seconditem");
//		System.out.println(item2);
//		context2.registerShutdownHook();
		
		AbstractApplicationContext  context3 = new ClassPathXmlApplicationContext("lifeconfig.xml");
		Item3 item3 = (Item3) context3.getBean("item");
		System.out.println(item3);
		context3.registerShutdownHook();
	}

}
