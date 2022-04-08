package com.testng.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoLogger1 {

	private static Logger logger = LogManager.getLogger(DemoLogger1.class);

	@Test
	public void test() {
		// TODO Auto-generated method stub
		
        logger.info("Other Package DemoLogger");
        
	}
}
