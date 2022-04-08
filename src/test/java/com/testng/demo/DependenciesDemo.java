package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesDemo {

	@Test
	public void userRegister() {
		System.out.println("User Register");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "userRegister" },alwaysRun=true)
	public void userSearch() {
		System.out.println("User Search");
	}

	@Test
	public void userClose() {
		System.out.println("User Close");
	}
	
	@Test(groups = { "init" })
	public void serverStartedOk() {}
	 
	@Test(groups = { "init" })
	public void initEnvironment() {}
	 
	@Test(dependsOnGroups = { "init.*" })
	public void method1() {}

}
