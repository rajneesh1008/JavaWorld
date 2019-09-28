package com.axon.core.SpringCore_Interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(MOCUtil.class);
    	//PersonImpl personImpl = container.getBean(PersonImpl.class);
    	//System.out.println(personImpl);
    	Person person = container.getBean(Person.class);
    	System.out.println(person);
    	container.close();
    } 
}
