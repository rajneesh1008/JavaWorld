package com.verizon.SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container= new ClassPathXmlApplicationContext("spring.xml");
    	HibernateTemplate hibernateTemplate = container.getBean(HibernateTemplate.class);
    	Employee employee = new Employee();
    	hibernateTemplate.load(employee,1);
    	System.out.println(employee.getName());
    	container.close();
    }
}
