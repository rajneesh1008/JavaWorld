package com.verizon.util;

import java.sql.Driver;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@PropertySource(value="classpath:com/verizon/Config/db.properties")
public class DataSourceUtil {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource() throws ClassNotFoundException {
		
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(environment.getProperty("db.driverClass"));
//		dataSource.setUrl(environment.getProperty("db.url"));
//		dataSource.setUsername(environment.getProperty("db.userName"));
//		dataSource.setPassword(environment.getProperty("db.password"));
//		return dataSource;
		
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		Class<Driver> cls=(Class<Driver>)Class.forName(environment.getProperty("db.driverClass"));
		dataSource.setDriverClass(cls);
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setUsername(environment.getProperty("db.userName"));
		dataSource.setPassword(environment.getProperty("db.password"));

		return dataSource;
		
		
	}

}
