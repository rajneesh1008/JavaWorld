package com.samsung.SpringCore_I18N;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

		String msg = container.getMessage("msg", null, null);
		System.out.println(msg);

		container.close();
	}
}
