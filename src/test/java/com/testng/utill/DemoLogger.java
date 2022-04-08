package com.testng.utill;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoLogger {

	private static Logger logger = LogManager.getLogger(DemoLogger.class);

	@BeforeSuite
	public void beforeSuite() {
		// TODO Auto-generated method stub
		
        logger.info("Other beforeSuite");
        
	}
	@Test
	public void test() {
		// TODO Auto-generated method stub
		logger.debug("This is a debug message DemoLogger");
        logger.info("This is an info message DemoLogger");
        logger.warn("This is a warn message DemoLogger");
        logger.error("This is an error message DemoLogger");
        logger.fatal("This is a fatal message DemoLogger");
	}
}
