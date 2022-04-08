package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebMethods {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.saucedemo.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("user-name")).sendKeys("Lokesh");
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).clear();
        
        System.out.println(driver.findElement(By.id("user-name")).getAttribute("type"));
        
        System.out.println(driver.findElement(By.id("login-button")).getCssValue("font-family"));
        
        System.out.println(driver.findElement(By.id("login-button")).getLocation());
        
        System.out.println(driver.findElement(By.id("login-button")).getSize());
        
        System.out.println(driver.findElement(By.id("login-button")).getTagName());
        
        System.out.println(driver.findElement(By.id("login-button")).getText());
        
        System.out.println(driver.findElement(By.id("login-button")).isDisplayed());
        
        System.out.println(driver.findElement(By.id("login-button")).isEnabled());
        
        System.out.println(driver.findElement(By.id("login-button")).isSelected());
        
        driver.findElement(By.id("login-button")).click();
        
	}

}
