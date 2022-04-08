package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://demoqa.com/droppable/");        
        driver.manage().window().maximize();
        
        WebElement from =  driver.findElement(By.id("draggable"));
        
        WebElement to = driver.findElement(By.id("droppable"));
        
        Actions action = new Actions(driver);
        
        //action.dragAndDrop(from, to).perform();
        
        action.clickAndHold(from).build().perform();
        
        action.moveToElement(to).build().perform();
        
        action.release(to).build().perform();
        
        
        
        
        
        
        
        
        
        
	}

}
