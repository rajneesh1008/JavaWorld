package com.amazon.MOC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container= new ClassPathXmlApplicationContext("spring.xml");
    	JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
    	String sql="select * from EMP_TBL";
    	List<Employee>empList= jdbcTemplate.query(sql,
    		new ResultSetExtractor<List<Employee>>() {

				@Override
				public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
					ArrayList<Employee> empList = new ArrayList<Employee>();
					while(rs.next()) {
					 Employee employee = new Employee();
					 employee.setEno(rs.getInt("eno"));
					 employee.setName(rs.getString("name"));
					 employee.setSalary(rs.getDouble("salary"));
					 empList.add(employee);
					}
					return empList;
					
				}
		
			});
    	empList.forEach(emp -> {
    		System.out.println(emp.getEno());
    		System.out.println(emp.getName());
    		System.out.println(emp.getSalary());
    	});
    	
    	container.close();
    }
   
}
