package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseService {

	@Autowired
	private DataSource dataSource;
	
	@GetMapping(path="/db")
	public DBDetails getDBDetails() {
		
		return new DBDetails(dataSource.getDriverClass(), dataSource.getUrl(),dataSource.getUserName(),dataSource.getPassword());
	}
}
