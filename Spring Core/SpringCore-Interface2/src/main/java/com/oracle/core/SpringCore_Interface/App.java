package com.oracle.core.SpringCore_Interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.register(MOCUtil.class);
		container.refresh();
		Person person = container.getBean(Person.class);

		person.display();
		container.close();
	}
}
