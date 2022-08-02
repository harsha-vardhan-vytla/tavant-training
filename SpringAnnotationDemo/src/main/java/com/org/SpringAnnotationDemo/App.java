package com.org.SpringAnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Manager e1 = con.getBean(Manager.class);
        
        e1.doWork();
        e1.getSalary();
    }
}
