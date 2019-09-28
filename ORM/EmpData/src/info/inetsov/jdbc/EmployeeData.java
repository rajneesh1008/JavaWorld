package info.inetsov.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	private Connection connection;
	private ArrayList<Employee> list;

	public List<Employee> getData() {
		try {
			String url = "jdbc:oracle:thin:rajneesh/password@localhost:1521:xe";
			connection = DriverManager.getConnection(url);
			Statement createStatement = connection.createStatement();
			ResultSet resultSet = createStatement.executeQuery("select * from emp_tbl");
			list = new ArrayList<Employee>();
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("eno"), resultSet.getString("name"),
						resultSet.getDouble("salary"));
				list.add(employee);
			}
		} catch (

		SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return list;

	}

}
