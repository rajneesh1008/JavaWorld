package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RetrieveEmployeeData {

	private List<Employee> empList;
	private Connection connection;

	public List<Employee> getEmployeeData() {
		String url = "jdbc:oracle:thin:rajneesh/password@localhost:1521:xe";
		try {
			connection = DriverManager.getConnection(url);
			String query = "select * from emp_tbl";
			ResultSet resultSet = connection.createStatement().executeQuery(query);
			empList = new ArrayList<Employee>();
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("eno"),resultSet.getString("name"),resultSet.getDouble("salary"));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return empList;
	}

}
