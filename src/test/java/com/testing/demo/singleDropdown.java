package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class singleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.sugarcrm.com/au/contact/sales/");        
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement ele = driver.findElement(By.name("employees_c"));
        
        Select se = new Select(ele);
        Thread.sleep(1000);
        se.selectByIndex(2);
        Thread.sleep(2000);
        se.selectByValue("level3");
        Thread.sleep(2000);
        se.selectByVisibleText("251 - 500 employees");
        
        
        
        
	}

}
