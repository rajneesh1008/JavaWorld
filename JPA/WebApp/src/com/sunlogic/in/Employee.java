package com.sunlogic.in;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EMP_TBL database table.
 * 
 */
@Entity
@Table(name="EMP_TBL")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long empid;
	private String empname;
	private BigDecimal salary;

	public Employee() {
	}


	@Id
	@SequenceGenerator(name="EMP_ENO_SEQ", sequenceName="EMP_ENO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_ENO_SEQ")
	@Column(unique=true, nullable=false, precision=19)
	public long getEmpid() {
		return this.empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}


	@Column(length=255)
	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}


	@Column(precision=38)
	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}