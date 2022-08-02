package com.springdemo.day12.explng;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanOrder")
public class Order1 {
	
	@Value("Advance Java Book")
	private String item;
	@Value("Rs 22.50")
	private String price;
	@Value("India")
	private String address;
	
}
