package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails {

	// Constructor
	WebDriver driver;

	ProductDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// locators

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement buttonaddTocart;
	
	public void addToCart() {
		
		buttonaddTocart.click();
	}

}
