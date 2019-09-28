package com.statestreet;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringTest {

	@Before
	public void demo() {
		System.out.println("we are in demo");
	}

	@After
	public void xyz() {
		System.out.println("after()");
	}

	@Test
	public void lengthTest() {
		String name = new String("verizon");
		int length = name.length();
		assertEquals(7, length);
	}

	@Test
	public void upperCaseTest() {
		String name = new String("statestreet");
		String upperCase = name.toUpperCase();
		assertEquals("STATESTREET", upperCase);

	}
	@Test(expected=NullPointerException.class)
    public void stringNullTest() {
	String name=null;
	name.length();
	}
	
}

