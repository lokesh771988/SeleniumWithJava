package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://artoftesting.com/sampleSiteForSelenium");        
        driver.manage().window().maximize();
        
        WebElement check = driver.findElement(By.xpath("//input[@value='Automation']"));
        
        check.click();
        
        if(check.isSelected() == true) {
        	System.out.println("it is checked");
        }else {
        	System.out.println("not cehfcked");
        }
        
        
        if(check.isEnabled() == true) {
        	System.out.println("it is enabled");
        }else {
        	System.out.println("not enabled");
        }
        
        
        
	}

}
