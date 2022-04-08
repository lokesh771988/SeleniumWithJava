package com.testng.demo;

import org.testng.annotations.Test;

public class DataProviderDemo3 {
	
	@Test(dataProvider = "setData",dataProviderClass = DataProverData.class)
	public void test(String userName,String password) {
		System.out.println(userName+"+++++"+password);
	}
	
	@Test(dataProvider = "setData",dataProviderClass = DataProverData.class)
	public void test1(String userName,String password,String text) {
		System.out.println(userName+"+++++"+password+"+++++"+text);
	}
}
