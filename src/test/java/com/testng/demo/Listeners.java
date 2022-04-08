package com.testng.demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.testng.commonData.BaseClass;
import com.testng.utill.GetScreenShot;

public class Listeners extends BaseClass implements ITestListener {

	public  void  onStart(ITestContext context) {
		System.out.println("Start Listener");
		Reporter.log("Start success :: "+context.getName());
		
	}
	
	public  void  onFinish(ITestContext context) {
		System.out.println("End Listener");
		Reporter.log("End success :: "+context.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listenere success");
		Reporter.log("Method success :: "+result.getName());
	}
	
	public  void  onTestFailure(ITestResult result) {
		System.out.println("Take Screenshot Listener");
		try {
			Date currentDate = new Date();
			String screenshotName = currentDate.toString().replace(" ", "_").replace(":", "_");
			
			File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File(".//Screenshot//screen_"+screenshotName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Reporter.log("<a href=\"C:\\Users\\GorantlL\\eclipse-workspace\\AutoamtionTesting\\Screenshot\\screen_Tue_Mar_22_12_34_47_IST_2022.png\">Test Result</a>");
	}
}
