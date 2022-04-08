package com.testing.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://artoftesting.com/sampleSiteForSelenium");        
        driver.manage().window().maximize();
        
        List<WebElement> list = driver.findElements(By.tagName("a"));
        
        for(WebElement li : list) {
        	System.out.println(li.getText()+" - "+li.getAttribute("href"));
        }
	}

}
