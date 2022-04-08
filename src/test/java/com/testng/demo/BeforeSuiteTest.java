package com.testng.demo;

import org.testng.annotations.Test;

import com.testng.commonData.SuiteClass;

public class BeforeSuiteTest extends SuiteClass {

	@Test
	public void test1() {
		System.out.println("beforesuite test1");
	}
	
	@Test
	public void test2() {
		System.out.println("beforesuite test2");
	}
}
