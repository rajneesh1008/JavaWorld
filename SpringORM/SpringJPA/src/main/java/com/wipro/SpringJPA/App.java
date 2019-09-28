package com.wipro.SpringJPA;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.DAO.EmployeeDAO;
import com.wipro.Entity.Employee;
import com.wipro.Util.MOCUtil;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(MOCUtil.class);
    	EmployeeDAO employeeDAO = container.getBean(EmployeeDAO.class);
    	employeeDAO.saveEmployee(new Employee(56, "Minal",10000d));
    	container.close();
    }
}
