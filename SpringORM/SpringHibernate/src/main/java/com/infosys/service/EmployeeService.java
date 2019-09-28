package com.infosys.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.DAO.EmployeeDAO;
import com.infosys.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public void saveEmpData(List<Employee>empList) {
		empList.forEach(employee ->employeeDAO.save(employee));
	}

	}

