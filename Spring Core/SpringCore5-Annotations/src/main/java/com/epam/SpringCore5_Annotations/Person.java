package com.epam.SpringCore5_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	
	private Address address;
    @Autowired
	public Person(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
	
	/*public Person() {
		System.out.println("Person Object is created");
			}
	@Value("10")
	private Integer pid;
	@Value("Anil")
	private String name;
    @Autowired
	private Address addr;
    
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
			System.out.println(getPid());
			System.out.println(getName());
			System.out.println(getAddr().getState());
		}

		public Address getAddr() {
			return addr;
		}
		public void setAddr(Address addr) {
			this.addr = addr;
		}
		@Override
		public String toString() {
			return "Person [pid=" + pid + ", name=" + name + ", addr=" + addr + "]";
		}*/
}