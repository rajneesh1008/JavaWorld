package com.amazon.SpringJDBCResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
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
    	/*String query="select * from EMP_TBL";
    	List<Employee> empList = jdbcTemplate.query(query, new EmployeeResultSetExtractor());
    	empList.forEach(employee -> {
    		System.out.println(employee.getEno());
    		System.out.println(employee.getName());
    		System.out.println(employee.getSalary());
    	});*/
    	String sql="select count (*)abc from EMP_TBL";
    	Integer count = jdbcTemplate.query(sql, 
    		new ResultSetExtractor<Integer>() {

				@Override
				public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
					int count=0;
					if(rs.next()) {
						count=rs.getInt("abc");
					}
					return count;
				}
			});
    	System.out.println(count);
    	container.close();
    }
}
