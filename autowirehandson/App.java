package com.springdemo.autowirehandson;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext con=
        		new AnnotationConfigApplicationContext(com.springdemo.autowirehandson.Appconfig.class);
        
        Employee e=con.getBean(Employee.class);
        
        Passport p=new Passport();
		p.setPassNum(9999);
		p.setDateofIssue(new Date(2020,02,02));
		p.setDateofExpiry(new Date(2000,07,12));
		
		e.setEmpId(1);
		e.setEmpName("harsha");
		e.setPassObj(p);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getPassObj());
		
        
        
        
    }
}