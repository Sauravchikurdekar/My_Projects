package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieList {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ActList.xml");
		Movie m = context.getBean(Movie.class);
		System.out.println(m);

		List<Actors> actList = m.getActList();
		for (Actors act : actList) {
			System.out.println(act);

		}

	}

}
