package com.spring.day11.di_con;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{

    public Accountant() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Accountant construtor !!!!");
    }
    @Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println(" Accountant Is hired too manage the all expenses of the company ");
	}
    @Override 
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println(" Office paid to accountant 50000 rs per/month");
	}

}
	
