package com.org.SpringAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("manage the branch & other emps");
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("manager salry : 90000pm");
	}

}
