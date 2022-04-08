package com.testing.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotMethod {

	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  WebDriver driver;
		  
		  WebDriverManager.chromedriver().setup(); 
		  driver = new ChromeDriver();
		  
		  driver.get("https://artoftesting.com/sampleSiteForSelenium");
		  driver.manage().window().maximize();
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  
		  File trg = new File(".\\Screenshot\\test.png");
		  
		  FileUtils.copyFile(src, trg);
		  
		
	}
}
