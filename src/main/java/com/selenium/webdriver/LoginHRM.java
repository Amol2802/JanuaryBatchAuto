package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHRM {

	public static void main(String[] args) throws InterruptedException  {
 
		
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
	//	driver.manage().window().minimize();
		 Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
	    Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium")).click();
		
	//	driver.close();
	//	driver.quit();
	}

}
