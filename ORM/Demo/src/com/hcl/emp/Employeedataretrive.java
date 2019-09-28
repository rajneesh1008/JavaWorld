package com.hcl.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Employeedataretrive {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:rajneesh/tiger@localhost:1521:xe");
		String query = "select * from EMP_TBL";
		ResultSet resultSet = connection.createStatement().executeQuery(query);
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		while (resultSet.next()) {
			Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
			emplist.add(employee);
		}
		emplist.forEach(System.out::println);
		connection.close();
	}

}
