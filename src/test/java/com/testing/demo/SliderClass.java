package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        
       WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
       
       driver.switchTo().frame(ele);
       
       WebElement el = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
       
       Point point = el.getLocation();
       
       int x = point.getX();
       int y = point.getY();
       int value = 5;
       int total = value+y;
       
       Actions action = new Actions(driver);
       Thread.sleep(1000);
       action.dragAndDropBy(el, x, total).perform();
       
       
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}


