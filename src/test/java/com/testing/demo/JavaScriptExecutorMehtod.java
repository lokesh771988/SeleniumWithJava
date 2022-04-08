package com.testing.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorMehtod {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		Thread.sleep(2000);
		js.executeScript("document.getElementById('fname').value='lokesh'");
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("idOfButton"));
		js.executeScript("arguments[0].click()", ele);
		
		
		
		
		
		
		
		
	}

}
