package com.testing.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement userName = driver.findElement(By.xpath("//*[text()='( Username : Admin | Password : admin123 )']"));
		String name = userName.getText();
		System.out.println(name);
		}

}
