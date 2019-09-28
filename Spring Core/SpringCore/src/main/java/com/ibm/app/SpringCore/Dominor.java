package com.ibm.app.SpringCore;

import java.util.Map;

public class Dominor {
	
	/*private Map<String,String> states;

	public Map<String, String> getStates() {
		return states;
	}

	public void setStates(Map<String, String> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "System [states=" + states + "]";
	}*/
	
	private Integer pid;
	private String name;
	
	public Dominor(Integer pid, String name) {
		
		this.pid = pid;
		this.name = name;
	
	}

	@Override
	public String toString() {
		return "Dominor [pid=" + pid + ", name=" + name + "]";
	}
	
	

}
