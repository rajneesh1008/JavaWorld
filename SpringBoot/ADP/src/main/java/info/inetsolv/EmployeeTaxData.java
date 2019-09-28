package info.inetsolv;

public class EmployeeTaxData {

	private Integer eno;
	private Double salary;
	private Double netSalary;
	private Double taxAmount;
	private Integer portNumber;
	
	
	public EmployeeTaxData() {
	}
		
	public EmployeeTaxData(Integer eno, Double salary, Double netSalary, Double taxAmount) {
		super();
		this.eno = eno;
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
