package com.lenovo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the EMP_TBL database table.
 * 
 */
@Entity
@Table(name="EMP_TBL")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMP_TBL_ENO_GENERATOR", sequenceName="EMP_ENO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_TBL_ENO_GENERATOR")
	private long eno;

	private String name;

	private BigDecimal salary;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="empTbl",cascade=CascadeType.ALL)
	private List<Address> addressTbls;

	public Employee() {
	}

	public long getEno() {
		return this.eno;
	}

	public void setEno(long eno) {
		this.eno = eno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public List<Address> getAddressTbls() {
		return this.addressTbls;
	}

	public void setAddressTbls(List<Address> addressTbls) {
		this.addressTbls = addressTbls;
	}

	public Address addAddressTbl(Address addressTbl) {
		getAddressTbls().add(addressTbl);
		addressTbl.setEmpTbl(this);

		return addressTbl;
	}

	public Address removeAddressTbl(Address addressTbl) {
		getAddressTbls().remove(addressTbl);
		addressTbl.setEmpTbl(null);

		return addressTbl;
	}

}