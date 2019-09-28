package com.cognizant.in.SpringCore4;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {
	
	private String address;

	public String getAddress() {
		return address;
	}
    @Value("Maharastra")
    @Required
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

}
