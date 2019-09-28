package com.dxc;

public class App {

	public static void main(String[] args) {
		
		COne cOne = new COne();
		// cOne.methodOne(new Abc());
		cOne.methodOne(
				new MyInterface() {;
					
					@Override
					public void doWork() {
						System.out.println("examples");
						
					}
				}
	    );

	}

}
