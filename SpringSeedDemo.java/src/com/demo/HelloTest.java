package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloTest {

	public static void main(String[] args) {
Resource rs =new ClassPathResource("hello.xml")	;
BeanFactory bean=new XmlBeanFactory(rs);
Hello h=bean.getBean(Hello.class);
h.msg();

	}

}