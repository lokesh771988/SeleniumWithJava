package com.testng.utill;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.testng.commonData.BaseClass;

public class GetScreenShot extends BaseClass{
	
	public void getScreenshot() throws IOException {
		
		Date currentDate = new Date();
		String screenshotName = currentDate.toString().replace(" ", "_").replace(":", "_");
		
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(".//Screenshot//screen_"+screenshotName+".png"));
	}

}
