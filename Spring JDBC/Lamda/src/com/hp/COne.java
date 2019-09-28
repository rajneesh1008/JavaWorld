package com.hp;

public class COne {
	
	public void methodOne(MyInterface myInterface) {
		int count = myInterface.add(10, 20);
		System.out.println(count);
	}
}
