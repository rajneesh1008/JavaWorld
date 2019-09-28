package com.ibm.app.SpringCore;


public class Person {

	private Integer pid;
	private String name;

	
	public Person() {
		System.out.println("Person Object is created");
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		System.out.println("Set Pid is called");
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setname is called ");
		this.name = name;
	}

		public void init() {
			System.out.println("init() is called");
		}
			public void destroy() {
				System.out.println("destroy() is called");
			
		}
		@Override
		public String toString() {
			return "Person [pid=" + pid + ", name=" + name + "]";
		}
	
	
}