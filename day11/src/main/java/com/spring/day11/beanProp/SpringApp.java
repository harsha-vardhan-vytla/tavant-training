package com.spring.day11.beanProp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		Employee e = (Employee) con.getBean("emp");
		
		
		System.out.println(" emp     id:"+e.getId());
		System.out.println(" emp   name:"+e.getName());
		System.out.println(" emp salary:"+e.getSalary());
	
	}

}
