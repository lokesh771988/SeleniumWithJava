package com.testng.demo;

import org.testng.annotations.Test;

import com.testng.commonData.SuiteClass;

@Test(groups = { "Smoke" })
public class GroupsMethod extends SuiteClass{

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("add method");
	}
	@Test(groups = { "Regresstion" })
	public void test2() {
		System.out.println("sub method");
	}
	
	@Test(groups = { "sanity" })
	public void test3() {
		System.out.println("add method");
	}
	@Test(groups = { "sanity" })
	public void test4() {
		System.out.println("sub method");
	}
}
