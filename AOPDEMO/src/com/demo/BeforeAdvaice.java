package com.demo;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvaice implements MethodBeforeAdvice {

		@Override
		public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
			System.out.println("Accout Detail");
		}		
	}

	
