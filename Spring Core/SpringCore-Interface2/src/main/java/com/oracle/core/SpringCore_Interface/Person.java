package com.oracle.core.SpringCore_Interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {

	@Value("10")
	private Integer pid;
	@Value("Anil")
	private String name;
	@Autowired
	@Qualifier(value="addr")
	private Address address;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println(getPid());
		System.out.println(getName());
		getAddress().addressDisplay();
	}
}
