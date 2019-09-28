package com.verizon.core.SpringCore3;
/* <annotaion-config */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {

	 	ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	Person person = container.getBean(Person.class);
    	Address address = container.getBean(Address.class);
    	System.out.println(person);
    	System.out.println(address);
    	
    	((AbstractApplicationContext) container).close();
    }
}
