package com.amazon.BeanPostProcessor;

public class Person {
	
	public Person() {
		System.out.println("Person Object is Created");
	}
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	}

