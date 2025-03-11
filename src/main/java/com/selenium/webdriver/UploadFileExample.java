package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) {

		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");

			driver.manage().window().maximize();
		
			String filepath="C://Users/JAYA VYAWHARE/Documents/Book1.xlsx";
			
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			
			WebElement fileUpload=driver.findElement(By.id("uploadfile"));
			js.executeScript("arguments[0].scrollIntoView();",fileUpload );
			
	       fileUpload.sendKeys(filepath);
		
	}

}
