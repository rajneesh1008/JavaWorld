package com.hp.core.SpringCore2PostProcessor;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("10")
	private Integer pid;
    @Value("Anil")
	private String name;

	public Integer getPid() {
		return pid;
	}

	@Required
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

    @Required
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
