package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelction {

	public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		WebElement dropDown=driver.findElement(By.id("drop1"));
		
		Select s= new Select(driver.findElement(By.id("drop1")));
		
		//s.selectByIndex(1);
	   // 	s.selectByValue("jkl");
		
		s.selectByVisibleText("doc 1");
		

	}

}
