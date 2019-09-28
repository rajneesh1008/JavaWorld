package com.hcl.jdbc;

import java.util.List;

public class App {

	public static void main(String[] args) {
		RetrieveEmployeeData employeeData = new RetrieveEmployeeData();
		List<Employee> data = employeeData.getEmployeeData();
		for (Employee employee : data) {
			System.out.println(employee.getEno());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
		}
	}

}
