package com.testing.demo;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NearMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement password = driver.findElement(By.xpath("//*[contains(text(),'Password:')]"));
		WebElement psd = driver.findElement(with(By.tagName("input")).near(password));
		psd.sendKeys("admin123");
	}

}
