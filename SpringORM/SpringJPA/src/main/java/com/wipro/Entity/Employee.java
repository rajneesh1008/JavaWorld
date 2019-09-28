package com.wipro.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TBL",schema="brainwave")
public class Employee {
    
	@Id
	private Integer eno;
	private String name;
	private Double salary;
	
	public Employee(Integer eno, String name, Double salary) {
		
		this.eno = eno;
		this.name = name;
		this.salary = salary;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
