package com.spring.day11.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

		Class_A a = c.getBean("a" , Class_A.class);

		a.display();

	}
}
