package com.amazon.SimpleJDBCInsert;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
public class SimpleJdbcInsertUtil {

	@Autowired
	private DataSource dataSource;
	
	@Bean
	public SimpleJdbcInsert simpleJdbcInsert() {
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
		return jdbcInsert;
		
	}
}
