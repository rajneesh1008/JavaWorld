package com.google.com.PropertyFile_Environment;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value="classpath:com/google/config/db.properties")
public class DataSource {
	
	@Autowired
	private Environment environment;
	
	public void display() {
		System.out.println(environment.getProperty("db.driverClass"));
		System.out.println(environment.getProperty("db.url"));
		System.out.println(environment.getProperty("db.userName"));
		System.out.println(environment.getProperty("db.password"));
	}

	@Override
	public String toString() {
		return "DataSource [environment=" + environment + "]";
	}
	
}
