package com.springdemo.arndadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");  
        Operation e = (Operation) context.getBean("opBean1");  
        System.out.println("calling msg...");  
        e.msg();  
        System.out.println("calling m...");  
        e.display();     
	}
}
