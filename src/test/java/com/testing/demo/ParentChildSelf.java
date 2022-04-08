package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentChildSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		//https://demo.nopcommerce.com/register?returnUrl=%2F
		//WebElement userName = driver.findElement(By.xpath("//input[@name='firstName']//ancestor::td//input[@name='userName']"));
		WebElement userName = driver.findElement(By.xpath(""));
		userName.sendKeys("Hellow");
	}

}
