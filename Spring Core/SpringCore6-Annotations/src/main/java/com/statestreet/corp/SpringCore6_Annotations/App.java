package com.statestreet.corp.SpringCore6_Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);

		Person person = container.getBean(Person.class);
		System.out.println(person);

		((AbstractApplicationContext) container).close();

	}

}
