package com.deloitte.SpringPropertyFile_Environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
        DataSource dataSource = container.getBean(DataSource.class);
        System.out.println(dataSource);
		container.close();
	}

}
