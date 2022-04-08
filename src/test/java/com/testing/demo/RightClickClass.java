package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        
       WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
       
       driver.switchTo().frame(ele);
       
       Actions action = new Actions(driver);
       
       //WebElement el = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
       
       action.contextClick().perform();
       
       
       
	}

}
