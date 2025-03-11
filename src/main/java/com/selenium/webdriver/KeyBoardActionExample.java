package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionExample {

	public static void main(String[] args) {

		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");

			driver.manage().window().maximize();
			
			driver.findElement(By.id("user-name")).sendKeys("Amol");
			
			Actions act= new Actions(driver);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();   // selecting the text
			
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();      // copy the selected text
			
			act.sendKeys(Keys.TAB).perform();      // move to next text box
		
			act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();     // paste the copied text

			act.sendKeys(Keys.ENTER).perform();    // clicking on Enter button
	}

}
