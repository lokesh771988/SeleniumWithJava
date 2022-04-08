package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://artoftesting.com/sampleSiteForSelenium");        
        driver.manage().window().maximize();
        
        WebElement radio = driver.findElement(By.id("female"));
        
        boolean boo = radio.isSelected();
        
        if(boo == true) {
        	System.out.println("already selected");
        }else {
        	radio.click();
        }
        
        boolean boo1 = radio.isDisplayed();
        
        if(boo1 == true) {
        	System.out.println("values is displayed");
        }else {
        	System.out.println("not present");
        }
        
        boolean boo2 = radio.isEnabled();
        
        if(boo2 == true) {
        	System.out.println("enabled");
        }else {
        System.out.println("not enabled");	
        }
        
        
        
        
        
        
        
	}

}
