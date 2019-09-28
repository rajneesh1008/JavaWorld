package info.inetsolv;


public class DBDetails {

	private String driverClass;
	private String url;
	private String userName;
	private String password;
		
	public DBDetails() {
	
	}
	public DBDetails(String driverClass, String url, String userName, String password) {
		super();
		this.driverClass = driverClass;
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
