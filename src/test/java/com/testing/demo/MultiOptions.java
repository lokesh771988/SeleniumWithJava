package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://demo.guru99.com/test/newtours/");
        
        driver.manage().window().maximize();
        
        System.out.println("Current URL:: "+driver.getCurrentUrl());
        
        System.out.println("Title:: "+driver.getTitle());
        
        System.out.println(driver.getPageSource());
        
        driver.navigate().to("https://www.google.com/");
        
        driver.close();
        
	}

}
