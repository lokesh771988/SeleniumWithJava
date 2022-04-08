package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		WebElement btn = driver.findElement(By.cssSelector("input.btn-default"));
		btn.click();
	}

}
