package com.wipro.factorydesign.instancefactory;

public class PersonFactory {

	public Person createPerson() {
		Person person = new Person();
		return person;
	}
}
