package com.lenovo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADDRESS_TBL database table.
 * 
 */
@Entity
@Table(name="ADDRESS_TBL")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADDRESS_TBL_AID_GENERATOR", sequenceName="ADDRESS_AID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_TBL_AID_GENERATOR")
	private long aid;

	@Column(name="\"STATE\"")
	private String state;

	private String street;

	//bi-directional many-to-one association to EmpTbl
	@ManyToOne
	@JoinColumn(name="EMPNO")
	private Employee empTbl;

	public Address() {
	}

	public long getAid() {
		return this.aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Employee getEmpTbl() {
		return this.empTbl;
	}

	public void setEmpTbl(Employee empTbl) {
		this.empTbl = empTbl;
	}

}