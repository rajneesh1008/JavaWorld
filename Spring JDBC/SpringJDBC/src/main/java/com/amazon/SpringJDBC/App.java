package com.amazon.SpringJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
    	//jdbcTemplate.update("insert into EMP_TBL values (110,'Rani',20000)");
    	
    	String query="insert into EMP_TBL values(?,?,?)";
    	jdbcTemplate.update(query,456,"Rajesh",20000d);
    	container.close();
    }
}
