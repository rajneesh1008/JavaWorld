package com.reflection.annotation1.Annotations_2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App 
{
    public static void main( String[] args ) throws NoSuchMethodException, SecurityException
    {
       Class<COne> cls=COne.class; /*Reading the Annotation at Class Level*/
       Annotation[] clsAnnotations = cls.getAnnotations();
       for (Annotation annotation : clsAnnotations) {
    	   Person person=(Person)annotation;
    	   System.out.println(person.pid());
    	   System.out.println(person.name());
    	   System.out.println(person.salary());
		
	}
    	
       Method method = cls.getMethod("methodOne",new Class[] {});/*Reading the Annotation at Method Level*/
       Annotation[] annotations = method.getAnnotations();
       for (Annotation annotation : annotations) {
		Person person=(Person)annotation;
		System.out.println(person.pid());
		System.out.println(person.name());
		System.out.println(person.salary());
	}
    }
}
