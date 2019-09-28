package com.ibm.app.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring2.xml");
		/*ApplicationContext child = new ClassPathXmlApplicationContext(new String[] { "spring2.xml" }, parent);
		Person person = parent.getBean(Person.class);
		System.out.println(person);
		
		Address address = child.getBean(Address.class);
		System.out.println(address);
		((AbstractApplicationContext) child).close();*/
		
		Person person = container.getBean(Person.class);
		System.out.println(person);
		 
		((AbstractApplicationContext)container).close();	
		}	
		
			
			
		}  
			
		
			
		
		
	

		
