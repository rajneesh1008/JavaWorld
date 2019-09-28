package com.amazon.SpringJdbcRowMapper;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
    	String sql="select * from EMP_TBL";
    	List<Employee> empList = jdbcTemplate.query(sql,new EmployeeRowMapper());
    	empList.forEach(employee -> {
    		System.out.println(employee.getEno());
    		System.out.println(employee.getName());
    		System.out.println(employee.getSalary());
    	});
    	container.close();
    }
}
