package com.testng.demo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipMethods {

	@Test(enabled=false)
	public void test1() {
		System.out.println("completly skipped");
	}
	
	@Test
	public void test2() {
		System.out.println("Second method Skipped");
		throw new SkipException("Second method Skipped");
	}
	
	boolean b = false;
	@Test
	public void test3() {
		System.out.println("completly skipped");
		if(b == true) {
			System.out.println("executed");
		}else {
			System.out.println("Method method skipped");
			throw new SkipException("Method method skipped");
		}
	}
	
}
