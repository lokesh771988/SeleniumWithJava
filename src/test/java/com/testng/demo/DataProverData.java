package com.testng.demo;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProverData {
	
	@DataProvider(parallel = true)
	public Object[][] setData(Method m) {
		
		Object[][] testData = null;
		
		if(m.getName().equals("test")) {
			testData = new Object[4][2];
			testData[0][0]="user1";
			testData[0][1]="pass1";
			
			testData[1][0]="user2";
			testData[1][1]="pass2";
			testData[2][0]="user3";
			testData[2][1]="pass3";
			testData[3][0]="user4";
			testData[3][1]="pass4";
		}else if(m.getName().equals("test1")) {
			testData = new Object[4][3];
			
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
		}
		
		
		return testData;
	}
}
