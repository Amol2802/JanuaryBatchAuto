package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();  // Handling the alert 
		
	//	driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("ta1")).sendKeys("Atoumtion testing");

	}

}
