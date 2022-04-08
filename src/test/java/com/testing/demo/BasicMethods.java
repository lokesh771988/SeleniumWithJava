package com.testing.demo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
        driver.get("https://www.sugarcrm.com/au/services/");
        
        driver.manage().window().maximize();
        //List of WebElements using findELements
        List<WebElement> el = driver.findElements(By.tagName("a"));       
        System.out.println(el);
        //Single FindElement
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/div/div/a")).click();
        
        Thread.sleep(1000);
        
        driver.navigate().to("https://support.sugarcrm.com/");
        Thread.sleep(1000);
        //Getting Unique Number
        String pr = driver.getWindowHandle();
        System.out.println(pr);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"latestTopics\"]/div/div[1]/span[2]/a")).click();
        Thread.sleep(2000);
        //Getting Set of String numbers
        Set<String> se = driver.getWindowHandles();
        System.out.println(se);
        
        
        
	}

}
