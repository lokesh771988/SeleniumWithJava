package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAndOR {

	public static void main(String[] args) {
		WebDriver driver;
		
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S419759837%3A1638867109812704&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement userName = driver.findElement(By.xpath("//*[@type='password' and @name='Passwd']"));
		userName.sendKeys("Hellow");
	}

}
