package com.springdemo.day12.explng;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway1 {

	@Value("#{beanOrder.item}")
	private String itemname;
	@Value("#{beanOrder}")
	private Order1 order1;
}
