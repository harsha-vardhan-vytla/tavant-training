package com.spring.day11.di_con;

public class Manager implements Employee{

	/*int id ;
	String name;
		public Manager(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}*/
		HumanResource hr ;
		Accountant account;//accountant class 
		

		
		
	public Manager(HumanResource hr, Accountant account) {
			super();
			this.hr = hr;
			this.account = account;
		}

	/*	public Manager(HumanResourse hr) {
			super();
			this.hr = hr;
		}*/

		

		@Override
		public void doWork() {
			// TODO Auto-generated method stub
			System.out.println(" Manage  The Barnch Office and others employees too !!!!");

		}

		@Override
		public void getSalary() {
			// TODO Auto-generated method stub
			System.out.println(" Office paid to manager 90000 rs per/month ");
		}
		public void callMetting() {
			account.doWork();
			hr.doWork();
			
		}
	
}
