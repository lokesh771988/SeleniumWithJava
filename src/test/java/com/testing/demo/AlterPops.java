package com.testing.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlterPops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");        
        driver.manage().window().maximize();
        
        WebElement element = driver.findElement(By.id("iframeResult"));
        
        driver.switchTo().frame(element);
        
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        
        String text = driver.switchTo().alert().getText();
        
        System.out.println(text);
        
        Thread.sleep(200);
        
        Alert alert = driver.switchTo().alert();
        
        alert.sendKeys("lokesh");
        
        driver.switchTo().alert().accept();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
