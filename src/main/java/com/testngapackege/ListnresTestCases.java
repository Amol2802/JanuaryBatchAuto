package com.testngapackege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//@Listeners(com.testngapackege.MyLisntenrs.class)
public class ListnresTestCases {
	
	WebDriver driver;

    
	@BeforeClass
	void setup() throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterClass
	void tearDown() {

		driver.close();
	}
	
	@Test(priority=1)
	void verifyLogo() throws InterruptedException {
		
		Thread.sleep(2000);
		boolean logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img[1]")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	 @Test(priority=2)	
	void login() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium")).click();
		Thread.sleep(2000);
		boolean dashborad=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(dashborad);
	}
	 @Test(priority=3)
	 void verifyTitle() {
		 
		String title= driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM1415");
		 
	 }
	 
	 @Test(priority=4,enabled=false)
	 void verifyHomePage() {
		 
		String title= driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM1415");
		 
	 }
}
