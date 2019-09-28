package info.inetsolv;

import java.util.Scanner;

public class PresentationLogicData {

	public static void main(String[] args) {
	     
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Employee No:");
	     Integer eno = scanner.nextInt();
	     System.out.println("Employee name:");
	     String name = scanner.next();
	     System.out.println("Employee Salary:");
	     Double salary = scanner.nextDouble();
	     Employee employee = new Employee();
	     employee.setEno(eno);
	     employee.setName(name);
	     employee.setSalary(salary);
	 
	 BusinessLogicRetrieveData businessLogicRetrieveData = new BusinessLogicRetrieveData();
	 businessLogicRetrieveData.persistEmployeeData(employee);
	 
	 scanner.close();
	    
	     
	     
	  

	}

}
