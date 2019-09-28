package com.infy.factorydesign.Factorydesign_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
		Phone phone = container.getBean("phone",Phone.class);
		System.out.println(phone);
		Phone phone1 = container.getBean("phone",Phone.class);
		System.out.println(phone1);
		Phone phone3 = container.getBean("phone",Phone.class);
		System.out.println(phone3);
		container.close();

	}
}
