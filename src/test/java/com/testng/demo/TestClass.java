package com.testng.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {


	@BeforeTest
	public void beforeT() {
		System.out.println("beforeTest");
	}
	
	@BeforeMethod
	public void beforeM() {
		System.out.println("beforeM");
	}
	@AfterMethod
	public void afterM() {
		System.out.println("afterM");
	}
	@AfterTest
	public void afterT() {
		System.out.println("afterT");
	}
	
	@Test(priority=2,description="adding two values")
	public void add() {
		System.out.println("add method");
	}
	@Test(priority=1,description="sub two values")
	public void sub() {
		System.out.println("sub method");
	}
	
}
