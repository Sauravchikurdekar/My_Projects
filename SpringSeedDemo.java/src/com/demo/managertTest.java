package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class managertTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("manager.xml");
		manager m=context.getBean(manager.class);
		System.out.println(m);
	}

}
