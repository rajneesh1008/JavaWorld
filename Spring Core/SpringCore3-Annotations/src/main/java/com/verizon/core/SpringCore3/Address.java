package com.verizon.core.SpringCore3;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;


public class Address {
	
	
	private String state;

	public String getState() {
		return state;
	}
	@Value("TN")
	@Required
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + "]";
	}
	

}



