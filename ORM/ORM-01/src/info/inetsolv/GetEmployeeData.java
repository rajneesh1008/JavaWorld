package info.inetsolv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetEmployeeData {
	private Connection connection;
	private List<Employee> empList;

	public List<Employee> getData() {
		String query = "select * from EMP_TBL";
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:brainwave/password@localhost:1521:xe");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			empList = new ArrayList<Employee>();
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("eno"), resultSet.getString("name"), resultSet.getDouble("salary"));
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
