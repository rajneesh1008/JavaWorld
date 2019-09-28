package com.worldbank.log4j;

import org.apache.log4j.Logger;

public class EmployeeDataRetrieve {

	    public static void main(String[] args) {
          
		Logger logger = Logger.getLogger(EmployeeDataRetrieve.class);
		
		
		
		logger.debug("Get Debug");
		logger.error("This is an Error");
		logger.trace("Get Trace");  
		logger.info("Get Info");
		logger.fatal("Get Fatal");
		
		

	}

}
