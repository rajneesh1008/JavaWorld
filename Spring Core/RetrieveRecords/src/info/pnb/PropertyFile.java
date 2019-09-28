package info.pnb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		properties.setProperty("emp.name.required","Eno is required");
		properties.store(new FileOutputStream("db.properties"),"sample program");
//		properties.load(new FileInputStream("db.properties"));
//		String driverclassname = properties.getProperty("db.drv");
//		String dburl = properties.getProperty("db.url");
//		
//	    Class.forName(drv);
//	    Connection connection=DriverManager.getConnection(url, user, password);
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(query);
//        while (resultSet.next()) {
//     	System.out.println(resultSet.getString(1));
//       	System.out.println(resultSet.getString(2));
//        	System.out.println(resultSet.getString(3));
        	
        }
	}
