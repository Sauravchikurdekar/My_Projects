package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		BankTransaction bk = context.getBean("proxy", BankTransaction.class);
		bk.withdrow();
		bk.deposite();
	}
}
