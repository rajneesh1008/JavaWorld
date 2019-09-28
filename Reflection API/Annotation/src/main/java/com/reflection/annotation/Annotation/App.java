package com.reflection.annotation.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App 
{
    public static void main( String[] args ) throws NoSuchMethodException, SecurityException
    {
        Class <COne> cls=COne.class;
        Method method = cls.getMethod("methodOne",new Class[] {});
        Annotation[] annotations = method.getAnnotations();
        //System.out.println(annotations.length);
        for (Annotation annotation : annotations) {
          System.out.println(annotation);
          MyAnnotation myAnnotation = (MyAnnotation) annotation;
          System.out.println(myAnnotation.name());
          
			
		}
        
    }
}
