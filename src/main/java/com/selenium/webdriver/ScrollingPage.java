package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://sourceforge.net/projects/geckodriver.mirror/");

			driver.manage().window().maximize();
			
			WebElement sampleText=driver.findElement(By.xpath("//h3[normalize-space(text())='Categories']"));
			
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			
			// Scroll to the bottom of the page
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		// scroll to perticular webeEleemnt	// vertical scroll
		//	js.executeScript("arguments[0].scrollIntoView();",sampleText );
			
			// scroll to using by pixel	
		//	js.executeScript("window.scrollBy(0,1800)");
			
			Thread.sleep(3000);
			// bottom to Top Scroll
			js.executeScript("window.scrollTo(0,0)");
			
	}

}
