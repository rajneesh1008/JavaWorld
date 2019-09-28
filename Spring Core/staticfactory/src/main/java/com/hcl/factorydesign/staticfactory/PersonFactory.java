package com.hcl.factorydesign.staticfactory;

public class PersonFactory {
	
	public static Person createPerson() {
		System.out.println("In Staic ()......");
		Person person = new Person();
		return person;
	}

}
