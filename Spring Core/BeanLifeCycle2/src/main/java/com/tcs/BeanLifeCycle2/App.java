package com.tcs.BeanLifeCycle2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	
    	container.close();
    }
}
