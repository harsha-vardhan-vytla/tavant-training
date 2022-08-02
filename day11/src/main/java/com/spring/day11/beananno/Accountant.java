package com.spring.day11.beananno;

public class Accountant implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("manages all expenses");
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("acctnt salry 50000pm");
	}

}
