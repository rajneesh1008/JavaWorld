package com.bmc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeService {

	int count;

	public int save (Employee employee) {
		Double salary = employee.getSalary();
		Double taxAmount = (salary * 30) / 100;
		Double netSalary = salary - taxAmount;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hcl", "abc");
			String query = "insert into EMP_TBL values(?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			prepareStatement.setLong(1, employee.getEno());
			prepareStatement.setString(2, employee.getName());
			prepareStatement.setDouble(3, netSalary);
			prepareStatement.setString(4, employee.getGender());
			prepareStatement.setString(5, employee.getAddress());

			count = prepareStatement.executeUpdate();

			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;

	}

}
