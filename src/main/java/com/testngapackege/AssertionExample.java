package com.testngapackege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	void login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium")).click();
		Thread.sleep(3000);
		String dashBoardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		
	     WebElement dashobard=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
				
		//Assert.assertEquals(dashBoardText, "Dashboardt875");
		
		//Assert.assertNotEquals(dashBoardText, "Dashboard");
		
		//Assert.assertTrue(dashobard.isDisplayed());
	    // Assert.assertTrue(false);
	    // Assert.assertFalse(false);
	}

}
