package com.spring.day11.beanannt;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("going on bike");
	}

}
