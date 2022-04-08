package com.testng.commonData;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteClass {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("BeforeSuite Run");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite close");
	}
}
