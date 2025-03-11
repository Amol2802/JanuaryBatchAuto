package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelsFramesExample {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");

			driver.manage().window().maximize();
			Thread.sleep(2000);

			driver.switchTo().frame("iframe1");    // switching the frame
			Thread.sleep(2000);
			driver.findElement(By.linkText("Google+")).click();
			
			driver.switchTo().defaultContent();   // switching to main frame/ page
			Thread.sleep(2000);
			
			driver.switchTo().frame("iframe2");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Google+")).click();
			
			//driver.switchTo().parentFrame();  // switching to parent frame

	}

}
