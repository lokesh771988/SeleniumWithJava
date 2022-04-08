package com.testng.demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAssert {

	@Test(groups = { "Regresstion" })
	public void verifyTitle() {
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.google.com/");        
        driver.manage().window().maximize();
        
        String expected = "Google1";
        
        String actual = driver.getTitle();
        
        assertEquals(actual, expected);
        
        
	}
}
