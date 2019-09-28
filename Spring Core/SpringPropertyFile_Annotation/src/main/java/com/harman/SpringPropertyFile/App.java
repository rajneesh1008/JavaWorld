package com.harman.SpringPropertyFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container=  new AnnotationConfigApplicationContext(MOCUtil.class);
    	String msg = container.getMessage("emp.required",new Object[] {"Eno"},null);
    	System.out.println(msg);
    	container.close();
    }
}
