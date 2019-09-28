package info.pnb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveRecords {

	public static void main(String[] args) throws Exception {
		
		String drv=System.getProperty("drv");
		String url=System.getProperty("url");
		String user=System.getProperty("user");
		String password=System.getProperty("password");
		String query=System.getProperty("query");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
        	System.out.println(resultSet.getString(1));
        	System.out.println(resultSet.getString(2));
        	System.out.println(resultSet.getString(3));
        	
        }
	}

}
