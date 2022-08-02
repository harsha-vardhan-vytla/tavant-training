package com.springdemo.day12.explng;

public class PaymentGateway {

	private String itemName;
	
	private Order order;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void processOrder() {
		System.out.println("Processing order: "+order.getItem());
	}
}
