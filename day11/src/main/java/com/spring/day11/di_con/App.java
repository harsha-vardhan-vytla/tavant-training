package com.spring.day11.di_con;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        
        //  AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
          
          ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
          Manager emp = c.getBean(Manager.class);
          
          emp.doWork();
          emp.getSalary();
          emp.callMetting();
       
        
    }
}
