package com.hcl.core.SpringCore1;

public class Address {

	private String state;

	@Override
	public String toString() {
		return "Address [state=" + state + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
