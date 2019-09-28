package com.verizon.MOCJDBC;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.verizon.DTO.Employee;
import com.verizon.Model.EmployeeService;
import com.verizon.util.MOCUtil;

public class App 
{
    public static void main( String[] args ) {
   	/* Scanner scanner = new Scanner(System.in);
     System.out.println("Employee No:");
     Integer eno = scanner.nextInt();
     System.out.println("Employee name:");
     String name = scanner.next();
     System.out.println("Employee Salary:");
     Double salary = scanner.nextDouble();
     Employee employee = new Employee();
     employee.setEno(eno);
     employee.setName(name);
     employee.setSalary(salary);*/
    	
    	
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(MOCUtil.class);
    	EmployeeService employeeService = container.getBean(EmployeeService.class);
    	/*int noofRecords = employeeService.calTax(employee);
    	System.out.println(noofRecords);*/
    	
    	/*Employee employee = employeeService.searchByEno(1);
    	System.out.println(employee.getName());*/
    	
    	/*List<Employee> empList = employeeService.findAllEmployee();
    	empList.forEach(employee -> {
    		System.out.println(employee.getEno());
    		System.out.println(employee.getName());
    		System.out.println(employee.getSalary());
    		
    	});*/
    	
    	List<Employee> empList = employeeService.findByName("Anil");
    	if(empList.size() >3)
    		System.out.println("Display the name");
    	else {
			System.out.println("Record no found");
			empList.forEach(employee -> {
				System.out.println(employee.getName());
			});
		}
    	container.close();
    }
}
