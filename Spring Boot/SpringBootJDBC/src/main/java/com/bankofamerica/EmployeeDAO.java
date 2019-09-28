package com.bankofamerica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	public int saveEmployee(Employee employee) {

		String sql = "insert into emp_tbl values(?,?,?)";
		return jdbcTemplate.update(sql,employee.getEno(),employee.getName(),employee.getSalary());
	}
}