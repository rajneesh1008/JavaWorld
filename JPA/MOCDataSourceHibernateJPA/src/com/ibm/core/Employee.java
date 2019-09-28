package com.ibm.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_TBL", schema = "brainwave")
public class Employee {
	@Id
	@Column(name = "EMPID")
	private Integer eno;
	@Column(name = "EMPNAME")
	private String name;
	@Column(name = "SALARY")
	private Double salary;

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