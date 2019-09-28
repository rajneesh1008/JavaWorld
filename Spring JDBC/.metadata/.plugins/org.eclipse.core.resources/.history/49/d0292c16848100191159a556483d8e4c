package com.amazon.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.DAO.EmployeeDAO;
import com.amazon.DTO.Employee;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void saveBulkData(List<Employee> empList) {
		employeeDAO.saveBulkData(empList);
	}
	}
	
