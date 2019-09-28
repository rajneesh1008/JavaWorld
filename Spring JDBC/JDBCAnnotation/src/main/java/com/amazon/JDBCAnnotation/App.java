package com.amazon.JDBCAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.amazon.util.MOCUtil;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(MOCUtil.class);
    	JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
    	jdbcTemplate.update("insert into EMP_TBL values (203,'Rina',50000)");
    	container.close();
    }
}
