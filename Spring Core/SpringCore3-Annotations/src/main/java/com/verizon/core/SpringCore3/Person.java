package com.verizon.core.SpringCore3;

import org.springframework.beans.factory.annotation.Value;


public class Person {

	@Value("10")
	private Integer pid;

	@Value("Anil")
	private String name;

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

	public void display() {
		System.out.println("Display() is called");

	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}

}
