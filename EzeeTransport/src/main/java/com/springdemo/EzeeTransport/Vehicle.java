package com.springdemo.EzeeTransport;

public class Vehicle {

	private String source;
	private Map<String,Double> DesMap;
	
	public Vehicle(String source) {
		super();
		this.source = source;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Map<String, Double> getDesMap() {
		return DesMap;
	}
	public void setDesMap(Map<String, Double> desMap) {
		DesMap = desMap;
	}
}
