package com.verizon.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.DAO.EmployeeDAO;
import com.verizon.DTO.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public int calTax(Employee employee) {
		Double salary = employee.getSalary();
		Double tax= salary * .3;
		Double netSalary=salary-tax;
		employee.setSalary(netSalary);
		return employeeDAO.save(employee);
}
	public Employee searchByEno(Integer eno) {
		return employeeDAO.findByEno(eno);
		
	}
	public List<Employee>findAllEmployee() {
		return employeeDAO.findAllEmployee();
		
	}
	public List<Employee>findByName(String name) {
		return employeeDAO.findByName(name);
		
	}
}