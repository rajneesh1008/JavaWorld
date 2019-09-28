
package com.sunlogic.in;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the ADDR_TBL database table.
 * 
 */
@Entity
@Table(name = "ADDR_TBL")
@NamedQuery(name = "Address.findAll", query = "SELECT e FROM Address e")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private String street;
	private String city;
	private String state;

	@Id
	@SequenceGenerator(name = "ADDR_STR_SEQ", sequenceName = "ADDR_STR_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADDR_STR_SEQ")
	@Column(unique = true, nullable = false, precision = 19)
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}