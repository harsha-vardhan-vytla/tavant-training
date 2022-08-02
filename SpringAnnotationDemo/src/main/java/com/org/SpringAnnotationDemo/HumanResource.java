package com.org.SpringAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class HumanResource implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("hires new emplys");
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("hRs  salry 60000pm");
	}

}
