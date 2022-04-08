package com.testng.utill;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

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
