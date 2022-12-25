package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstituteTest {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("institute.xml");
	Institute i=context.getBean(Institute.class);
	System.out.println(i);

	}

}
