package com.testing.demo;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToRightOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		WebElement testing = driver.findElement(By.xpath("(//a[contains(text(),'Testing')])[1]"));
		WebElement sap = driver.findElement(with(By.tagName("a")).toRightOf(testing));
		sap.click();
	}

}
