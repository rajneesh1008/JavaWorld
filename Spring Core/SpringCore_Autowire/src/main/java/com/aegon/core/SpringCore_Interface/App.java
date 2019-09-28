package com.aegon.core.SpringCore_Interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container= new AnnotationConfigApplicationContext(MOCUtil.class);
    	Person person = container.getBean(Person.class);
    	System.out.println(person);
    	Address address = container.getBean(Address.class);
    	System.out.println(address);
    	container.close();
    }
}
