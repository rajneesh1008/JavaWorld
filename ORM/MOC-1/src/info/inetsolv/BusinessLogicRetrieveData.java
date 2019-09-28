package info.inetsolv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

        public class BusinessLogicRetrieveData {
	    
		public void persistEmployeeData(Employee employee) {
		
		String query="insert into EMP_TBL values(?,?,?)";
    try {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:brainwave/password@localhost:1521:xe");
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setInt(1, employee.getEno());
		prepareStatement.setString(2, employee.getName());
		prepareStatement.setDouble(3, employee.getSalary());
		prepareStatement.close();
		connection.close();
		
		
		
		
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}		
		
		
		
	}
	
	

}
