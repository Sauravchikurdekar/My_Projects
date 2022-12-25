package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.dao.EmployeeDao;
import com.easylearning.service.CreditCardService;
import com.easylearning.service.LoanService;

public class Main {

	public static void main(String... args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		
//		LoanService service = context.getBean("loanService",LoanService.class);
//		service.issueLoan("Jack123");
//		service.payDue("Jack123");

		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		CreditCardService service=context.getBean("CreditCardService",CreditCardService.class);
		
		service.issueCreditCard("jack123");
		service.blockCreditCard("jack123");
		service.payDue("jack123");
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		EmployeeDao e = context.getBean("EmployeeDao", EmployeeDao.class);
//         e.save(101,"saurav",20000);
	}

}