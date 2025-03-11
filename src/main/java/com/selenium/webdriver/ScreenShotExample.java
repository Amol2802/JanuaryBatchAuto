package com.selenium.webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {
	
	public static void main(String[] args) throws IOException {
			
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");

			driver.manage().window().maximize();
						
			TakesScreenshot screenshot=  ((TakesScreenshot) driver ) ;
			
			File file=screenshot.getScreenshotAs(OutputType.FILE);
			
			File location= new File("C://Users//JAYA VYAWHARE/Documents/JavaScreenShots/sourceForge.png");
			
			FileUtils.copyFile(file, location);
	}

}
