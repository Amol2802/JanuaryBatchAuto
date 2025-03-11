package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonAndConditionalStatement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		
		/*
		 * WebElement femaleRadioButton= driver.findElement(By.id("radio2"));
		 * System.out.println(femaleRadioButton.isSelected());    //// this method is checking the eleement is Selected or not
		 * 
		 * femaleRadioButton.click();
		 * 
		 * System.out.println(femaleRadioButton.isSelected());
		 * 
		 * WebElement checkBoxBlue=driver.findElement(By.id("checkbox2"));
		 * checkBoxBlue.click();
		 * System.out.println("Check box selection checking "+checkBoxBlue.isSelected())
		 * ; Thread.sleep(3000);
		 * 
		 * WebElement checkBoxOrange=driver.findElement(By.id("checkbox1"));
		 * checkBoxOrange.click();
		 */
	
		WebElement button2=driver.findElement(By.id("but2"));
	
		//boolean ele=button2.isEnabled();
		System.out.println(button2.isEnabled()); // this method is checking the eleement is enabled or not
		

		WebElement button1=driver.findElement(By.id("but1"));
	
		//boolean ele=button1.isEnabled();
		System.out.println(button1.isEnabled());
		
		WebElement mondayText=	driver.findElement(By.xpath("//span[normalize-space(text())='Monday, May 13, 2013']"));
		System.out.println(mondayText.isDisplayed());   // this method is checking the eleement is presenet/Displayed  or not  on page
		
		
		String textValue=mondayText.getText();   // it will return text of webelement
		System.out.println(textValue);
	}

}
