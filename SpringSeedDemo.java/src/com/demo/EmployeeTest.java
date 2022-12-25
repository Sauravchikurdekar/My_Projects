package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) {

		/*
		 * Resource rs=new ClassPathResource(null); BeanFactory bean=new
		 * XmlBeanFactory(rs); Employee emp=(Employee)bean.getBean("e"); emp.msg();
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		Employee emp=context.getBean(Employee.class);
		emp.msg();
	}

}
