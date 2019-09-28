package com.ibm.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TBL",schema="brainwave")
public class Employee {

	@Id
	@Column(name="ENO")
	private Integer EmpNo;
	@Column(name="NAME")
	private String EmpName;
	@Column(name="SALARY")
	private Double EmpSalary;

	public Integer getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(Integer empNo) {
		EmpNo = empNo;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(Double empSalary) {
		EmpSalary = empSalary;
	}

}
