package com.spring.day11.beanxml;

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
        
        //normal implementation
        Vehicle v0 = new Car();
        v0.drive();
        Vehicle v1 = new Bike();
        v1.drive();
        System.out.println(".......................");
        
        //bean implementation
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
        
        Vehicle veh1 = (Vehicle) con.getBean("bike");
        veh1.drive();    //veh1 is an bean of class bike
        
        Vehicle veh2 = (Vehicle) con.getBean("car");
        veh2.drive();    //veh2 is an bean of class car
        
        
        
        
        
        
    }
}
