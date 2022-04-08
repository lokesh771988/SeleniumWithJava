package com.testng.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeCLassAndBeforeGroup extends Listeners {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before CLass run");
	}
	
	@BeforeGroups(value="sanity")
	public void beforeGroup() {
		System.out.println("Before Group methods runing");
	}
	
	@AfterGroups(value="sanity")
	public void afterGroup() {
		System.out.println("after Group methods runing");
	}
	@Test(groups = "sanity")
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(groups = "regression")
	public void test2() {
		System.out.println("Test2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class run");
	}
}
