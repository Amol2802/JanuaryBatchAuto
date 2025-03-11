package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	// Constructor
		WebDriver driver;
		
		LoginPage2(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		// locators
				
		@FindBy(name="user-name") 
		WebElement userName;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@value='Login']")
		WebElement buttonlogin;
		
		
		//Action Methods
		public void enterUserName(String username) {

			userName.sendKeys(username);
		
		}
		
		public void enterPassword(String pwd) {

			password.sendKeys(pwd);
			
			}
		
		public void clickOnLoginButton() {

			buttonlogin.click();
			
			}
		
	
	
}
