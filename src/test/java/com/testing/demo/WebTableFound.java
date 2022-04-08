package com.testing.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println(rows.size());
		int rowsSize = rows.size();

		List<WebElement> cloums = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
		System.out.println(cloums.size());

		int cloumSize = cloums.size();

		for (int i = 1; i <= rowsSize; i++) {
			for (int j = 1; j <= cloumSize; j++) {
				System.out.println(
						driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[" + j + "]"))
								.getText() + " ");
			}
			System.out.println();
		}

	}
}