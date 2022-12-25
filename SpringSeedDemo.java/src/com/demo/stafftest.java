package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stafftest {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("staff.xml");
staff s=context.getBean(staff.class);
System.out.println(s);
	}

}
