package com.oracle.core.SpringCore_Interface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
@Qualifier(value="addr")
public class CongressAddressImpl implements Address {

	public void addressDisplay() {
		System.out.println("Congress Address");
	}
}