package com.springdemo.EzeeTransport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Booking book=context.getBean("booking",Booking.class);
		TransportService ts=context.getBean("trans",TransportService.class);
		ts.registerBooking(book);
		ts.calculateTravelCost("Delhi", "Banglore", "21-09-2002");
		System.out.println(ts.checkAvailableDateForTravel("20-09-2001"));
		System.out.println(ts.getCost("Hyderabad"));

	}

}