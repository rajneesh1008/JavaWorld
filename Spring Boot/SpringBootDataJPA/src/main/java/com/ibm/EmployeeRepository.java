package com.ibm;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
	
	public Employee eno(Integer eno);
}