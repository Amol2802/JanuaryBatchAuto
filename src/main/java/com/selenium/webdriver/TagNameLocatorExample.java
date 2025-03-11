package com.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocatorExample {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();

			
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement ele:links) {

			String text=ele.getText();
		//	System.out.println(text);
			
			if(text.equals("Posts (Atom)")) {
               ele.click();
				
		}
		}
		Thread.sleep(6000);
		
		driver.quit();
	}

}
