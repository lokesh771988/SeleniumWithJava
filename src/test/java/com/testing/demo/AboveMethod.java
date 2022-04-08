package com.testing.demo;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AboveMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver;
			
			
	        WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
			WebElement password = driver.findElement(By.id("txtPassword"));
			WebElement email = driver.findElement(with(By.tagName("input")).above(password));
			email.sendKeys("admin");
	}

}
