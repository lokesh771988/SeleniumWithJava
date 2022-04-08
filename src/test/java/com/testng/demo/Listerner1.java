package com.testng.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.testng.commonData.BaseClass;
import com.testng.commonData.MyRetry;

public class Listerner1 extends BaseClass{

	@Test
	//(retryAnalyzer = MyRetry.class)
	public void getUrl() {
		driver.get("www.google.com");
		assertTrue(false);
	}
	
}
