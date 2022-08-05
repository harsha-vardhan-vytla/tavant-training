package com.springdemo.singltonhandson;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dbconn c = 	Dbconn.getInstance();
		Dbconn c1= Dbconn.getInstance();

	}

}
