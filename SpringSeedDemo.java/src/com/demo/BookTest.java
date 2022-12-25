package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("book.xml");
		Book b=context.getBean(Book.class);
		System.out.println(b);
	}

}
