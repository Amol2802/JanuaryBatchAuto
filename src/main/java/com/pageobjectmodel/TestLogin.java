package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
	
	
	WebDriver driver;
	ProductDetails pd;
	LoginPage2 log1;
	
	@BeforeClass
	void setup() {

		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	void tearDown() throws InterruptedException {
     Thread.sleep(4000);
	driver.quit();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		Thread.sleep(3000);
	//	LoginPage log=new LoginPage(driver);
		
		 log1 = new LoginPage2(driver);
						
		log1.enterUserName("standard_user");
		log1.enterPassword("secret_sauce");
		log1.clickOnLoginButton();

	}
	@Test
	 void verifyAddToCart() throws InterruptedException {
		pd= new ProductDetails(driver);
		pd.addToCart();
		Thread.sleep(2000);
		 
	 }
	
	

}
