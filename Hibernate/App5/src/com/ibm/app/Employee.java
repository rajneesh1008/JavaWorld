package com.ibm.app;
// Generated 12 Mar, 2019 3:27:46 AM by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmpTbl generated by hbm2java
 */
@Entity
@Table(name = "EMP_TBL", schema = "BRAINWAVE")
public class Employee implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long empid;
	private String empname;
	private Long salary;

	public Employee() {
	}

	public Employee(long empid) {
		this.empid = empid;
	}

	public Employee(long empid, String empname, Long salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	@Id

	@Column(name = "EMPID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getEmpid() {
		return this.empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	@Column(name = "EMPNAME", length = 10)
	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Column(name = "SALARY", precision = 10, scale = 0)
	public Long getSalary() {
		return this.salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
