package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo1 {

	@Test(dataProvider = "test1")
	public void test(String userName,String password) {
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.saucedemo.com/");        
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        
        driver.close();
	}
	
	@DataProvider(name = "test1")
	public Object[][] setData() {
		
		Object[][] testData = new Object[4][2];
		
		testData[0][0]="standard_user";
		testData[0][1]="secret_sauce";
		
		testData[1][0]="locked_out_user";
		testData[1][1]="secret_sauce";
		testData[2][0]="problem_user";
		testData[2][1]="secret_sauce";
		testData[3][0]="performance_glitch_user";
		testData[3][1]="secret_sauce";
		
		return testData;
	}
}
