package com.testng.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testng.commonData.BaseClass;

public class DefaultReport extends BaseClass {
	
	@Test
	public void test() {
		System.out.println("Test");
		//driver.get("https://google.com");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
}
