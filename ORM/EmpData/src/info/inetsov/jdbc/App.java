package info.inetsov.jdbc;

import java.util.List;

public class App {

	public static void main(String[] args) {
	 EmployeeData employeeData = new EmployeeData();
	            List<Employee> list = employeeData.getData();
	            for (Employee employee : list) {
		System.out.println(employee.getEno()+" "+employee.getName()+" "+employee.getSalary());
				}
	 
	}

}
