package com.amazon.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amazon.DTO.Employee;



@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveBulkData(List<Employee> empList) {
		String sql="insert into emp_tbl values(?,?,?)";
		int[] batchUpdate = jdbcTemplate.batchUpdate(sql, 
			new BatchPreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps, int i) throws SQLException {
					Employee employee = empList.get(i);
					ps.setInt(1,employee.getEno());
					ps.setString(2,employee.getName());
					ps.setDouble(3,employee.getSalary());
					
				}
				
				@Override
				public int getBatchSize() {
					
					return empList.size();
				}
			});
		System.out.println(batchUpdate);
	}
}