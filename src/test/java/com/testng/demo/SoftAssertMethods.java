package com.testng.demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertMethods {

	@Test
	public void verifyTitle() {
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.google.com/");        
        driver.manage().window().maximize();
        
        String expected = "Google1";
        String googleSe = "Google Search";
        
        SoftAssert soft = new SoftAssert();
        
        String actual = driver.getTitle();
        
        soft.assertEquals(actual, expected,"title is not matched");

        String goole = driver.findElement(By.name("btnK")).getAttribute("value");
        
        soft.assertEquals(goole, googleSe,"button is not matched");
        
        driver.close();
        soft.assertAll();
	}
}
