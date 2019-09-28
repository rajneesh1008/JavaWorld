package log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee {

public static void main(String[] args) {
	 Logger logger = LogManager.getLogger();
	 logger.debug("Debug initiated");
	 logger.info("Info Received");
}

     

	}


