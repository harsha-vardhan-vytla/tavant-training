package com.spring.day11.di_con;

import org.springframework.stereotype.Component;

@Component
public class HumanResource implements Employee {
 
    public HumanResource() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println(" HR Construtor");
    }
 
    public void doWork() {
        // TODO Auto-generated method stub
    	System.out.println(" woking as a  Human Resources manager and convert human into resources .... ");
    }
 

    public void getSalary() {
        // TODO Auto-generated method stub
    	System.out.println(" Office paid to HR 60000 rs per/month");
    }
 
}
