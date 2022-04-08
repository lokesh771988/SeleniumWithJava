package com.testing.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationClass {

	public static String userName = "admin";
	public static String pass = "admin";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		  
		  WebDriverManager.chromedriver().setup(); 
		  driver = new ChromeDriver();
		  
		  //driver.get("https://the-internet.herokuapp.com/");
		  driver.get("https://"+userName+":"+pass+"@the-internet.herokuapp.com/basic_auth");
		  driver.manage().window().maximize();
		  
		  //https://admin:admin@the-internet.herokuapp.com/basic_auth
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
