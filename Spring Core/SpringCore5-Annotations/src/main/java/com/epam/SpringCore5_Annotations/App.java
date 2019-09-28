package com.epam.SpringCore5_Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!(@ComponentScan)
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    /*ApplicationContext container= new AnnotationConfigApplicationContext(Person.class);*/
    /*ApplicationContext container= new AnnotationConfigApplicationContext("com.epam");*/
    	AnnotationConfigApplicationContext container= new AnnotationConfigApplicationContext("com.epam");
        //container.register(SpringCoreUtil.class);
        //container.refresh();
        Person person = container.getBean(Person.class);
       // person.display();
        ((AbstractApplicationContext)container).close();
     
}
}