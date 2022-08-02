package com.spring.day11.beanannt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //bean implementation
        ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Bike veh1 =con.getBean(Bike.class);
        //Vehicle veh1 =(Vehicle) con.getBean(Bike.class);
          Vehicle veh1 =(Vehicle) con.getBean("bike");
        veh1.drive();    //veh1 is an bean of class bike
        
        //Vehicle veh2 = (Vehicle) con.getBean("car");
        //veh2.drive();    //veh2 is an bean of class car
        
        
        
        
        
        
    }
}
