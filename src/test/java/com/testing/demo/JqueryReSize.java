package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryReSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        
        driver.switchTo().frame(ele);
        
        WebElement from = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        
        Actions action = new Actions(driver);
        
        Point point = from.getLocation();
        int x = point.getX();
        int y = point.getY();
        
        System.out.println(x);
        System.out.println(y);
        action.dragAndDropBy(from, 150, 10).perform();
        
        
        
        
        
        
	}

}
