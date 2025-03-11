package com.testngapackege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

WebDriver driver;
	
	@Test(priority=1)
	void loginApp() throws InterruptedException {
		
		driver = new ChromeDriver();
	 	//	WebDriver driver = new FirefoxDriver();
	 	
	 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("openeing the application");
		driver.manage().window().maximize();
	 	
	 	//	driver.manage().window().minimize();
	 		 Thread.sleep(2000);
	 		driver.findElement(By.name("username")).sendKeys("Admin");
	 	    Thread.sleep(1000);
	 		driver.findElement(By.name("password")).sendKeys("admin123");
	 		Thread.sleep(1000);
	 	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 		
	 		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium")).click();
		System.out.println("login the application");

	}
	
}
