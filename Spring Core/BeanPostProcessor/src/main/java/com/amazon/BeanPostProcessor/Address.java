package com.amazon.BeanPostProcessor;

public class Address {

	public Address() {
		System.out.println("Address Object is created");
	}

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
