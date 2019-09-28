package com.hcl.factorydesign.staticfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	Person person = container.getBean(Person.class);
    	person.display();
    	
    	((AbstractApplicationContext)container).close();
    }
}
