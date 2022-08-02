package com.springdemo.befadvice;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.springdemo.AOP.CustomerService;
 
public class AppMain {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Bean.xml");
 
        CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
 
        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {
 
        }
 
    }
 
}


