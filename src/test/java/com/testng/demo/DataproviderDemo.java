package com.testng.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {

	@Test(dataProvider = "setData")
	public void test(String userName,String password) {
		System.out.println(userName+"+++++"+password);
	}
	
	@DataProvider
	public Object[][] setData() {
		
		Object[][] testData = new Object[4][2];
		
		testData[0][0]="user1";
		testData[0][1]="pass1";
		
		testData[1][0]="user2";
		testData[1][1]="pass2";
		testData[2][0]="user3";
		testData[2][1]="pass3";
		testData[3][0]="user4";
		testData[3][1]="pass4";
		
		return testData;
	}
	
	@Test(dataProvider = "setData1")
	public void test1(String userName,String password,String text) {
		System.out.println(userName+"+++++"+password+"+++++"+text);
	}
	
	@DataProvider
	public Object[][] setData1() {
		
		Object[][] testData = new Object[4][3];
		
		testData[0][0]="user1";
		testData[0][1]="pass1";
		testData[0][2]="test1";
		testData[1][0]="user2";
		testData[1][1]="pass2";
		testData[1][2]="test2";
		testData[2][0]="user3";
		testData[2][1]="pass3";
		testData[2][2]="test3";
		testData[3][0]="user4";
		testData[3][1]="pass4";
		testData[3][2]="test4";
		
		return testData;
	}
}
