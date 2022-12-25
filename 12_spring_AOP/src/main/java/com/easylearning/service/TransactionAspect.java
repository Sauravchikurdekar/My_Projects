package com.easylearning.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class TransactionAspect implements MethodBeforeAdvice, AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("commit");
		
	}


	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("transaction start");
		
	}
	

}