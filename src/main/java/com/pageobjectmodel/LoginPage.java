package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	// Constructor
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	// locators
	By uname= (By.name("user-name"));
	By password= (By.name("password"));
	By buttonlogin= (By.xpath("//input[@value='Login']"));
	
	
	//Action Methods
	public void enterUserName(String username) {

	driver.findElement(uname).sendKeys(username);
	System.out.println("added this is git commite code ***********");
	
	}
	
	public void enterPassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);
		
		}
	
	public void clickOnLoginButton() {

		driver.findElement(buttonlogin).click();
		
		}
	
}
