package com.amazon.DTO;

public class Employee {
	
	private Integer eno;
	private String name;
	private Double salary;
	
	
	public Integer getEno() {
		return eno;
	}
	public Employee(Integer eno, String name, Double salary) {
		
		
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
	