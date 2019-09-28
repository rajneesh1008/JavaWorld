package com.bankofamerica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication()
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DemoApplication.class, args);
		EmployeeDAO employeeDAO = container.getBean(EmployeeDAO.class);
		employeeDAO.saveEmployee(new Employee(205, "Ramesh",10000d));
		
	}

}
