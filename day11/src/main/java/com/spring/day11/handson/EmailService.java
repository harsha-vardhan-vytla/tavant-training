package com.spring.day11.handson;

public class EmailService implements MessageService {

	@Override
	public void sendMsg(String message) {
		// TODO Auto-generated method stub
		 System.out.println(message);
	}
}
