package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://demoqa.com/frames");        
        driver.manage().window().maximize();
        
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Count :: "+size);
        
        for(int i = 0; i<=size;i++) {
        	driver.switchTo().frame(i);
        	System.out.println(i);
        	driver.switchTo().parentFrame();
        	
        	if( i == 2) {
        		break;
        	}
        }
        
        WebElement element = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(element);
        String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println(text);
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame("frame1");
        String text1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println("second :: "+text1);
        driver.switchTo().parentFrame();        
	}

}
