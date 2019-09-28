package com.ibm.app.SpringCore;

public class Student {
	
	private Integer sid;
	private String name;
	private String fatherName;
	private String motherName;
	
	public Student() {
		System.out.println("Student Object is created");
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ "]";
	}
	

}
