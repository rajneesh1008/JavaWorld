package com.ibm.app.SpringCore;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring4.xml");
		/*ApplicationContext child = new ClassPathXmlApplicationContext(new String[] { "spring2.xml" }, parent);
		Person person = parent.getBean(Person.class);
		System.out.println(person);
		
		Address address = child.getBean(Address.class);
		System.out.println(address);
		((AbstractApplicationContext) child).close();*/
		
		Dominor dominor = container.getBean(Dominor.class);
		System.out.println(dominor);
			
		}	
		
			
			
		}  
			
		
			
		
		
	

		
