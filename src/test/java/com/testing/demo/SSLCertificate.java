package com.testing.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to Handle SSL Certificate in Selenium
		
		WebDriver driver;
		  
		 //WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
		DesiredCapabilities ds = new DesiredCapabilities();
		//ds.setAcceptInsecureCerts(true);
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//ChromeOptions option = new ChromeOptions();
		//option.merge(ds);
		
		InternetExplorerOptions option = new InternetExplorerOptions();
		  option.merge(ds);
		  //driver = new ChromeDriver(option);
		  driver = new InternetExplorerDriver(option);
		  
		  driver.get("https://expaired.badssl.com/");
		  driver.manage().window().maximize();
	}

}
