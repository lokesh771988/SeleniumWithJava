package com.testing.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");        
        driver.manage().window().maximize();
        
        WebElement element = driver.findElement(By.id("iframeResult"));
        
        driver.switchTo().frame(element);
        
        driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
        
        String parent = driver.getWindowHandle();
        
        Set<String> set = driver.getWindowHandles();
        
        Iterator<String> it = set.iterator();
        
        while(it.hasNext()) {
        	
        	String child = it.next();
        	
        	System.out.println(child);
        	
        	if(!parent.equals(child)) {
        		
        		driver.switchTo().window(child);
        		
        		driver.findElement(By.id("search2")).sendKeys("selenium");
        		
        		driver.findElement(By.id("learntocode_searchbtn")).click();
        				
        	}
        			
        	driver.switchTo().window(parent);		
        }
          
        
	}

}
