package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
			
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	//	driver.manage().window().minimize();
		
	//	driver.close();  // close current browser window
	//	driver.quit();  // it will close all the multiple browser window
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");

		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
	}

}
