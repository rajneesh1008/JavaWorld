package info.inetsolv;

public class HoneywellEmployee {

	private Integer eno;
	private String name;
	private String gender;
	private Double salary;
	private Double netSalary;
	private Double taxAmount;
	private Integer portNumber;
	
	
	
	public HoneywellEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public HoneywellEmployee(Integer eno, String name, String gender, Double salary, Double netSalary,
			Double taxAmount) {
		super();
		this.eno = eno;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.netSalary = netSalary;
		this.taxAmount = taxAmount;
	}


	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Integer getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
	
	
}
