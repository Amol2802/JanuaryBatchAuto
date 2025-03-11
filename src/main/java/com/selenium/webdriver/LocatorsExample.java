package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
			driver.get("https://omayo.blogspot.com/");
	//	driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
			
			String tiltle=driver.getTitle();  // return the title of the page
			System.out.println(tiltle);
			
			String url=driver.getCurrentUrl();  // return the current page url
			
			System.out.println(url);
		
			System.out.println(driver.getPageSource());  // return the page source
			
			driver.navigate().back();  // navigate to back page
			Thread.sleep(1000);
			driver.navigate().forward();  // navigate to next  page
			Thread.sleep(1000);
			driver.navigate().refresh();  // refresh the page
			
			
			

			// locatore usong class name
	//	WebElement textFiled=  driver.findElement(By.className("classone"));
		  
	//	textFiled.sendKeys("Automation Testing");
		
			//link text
			
		//	WebElement selenium143text=	driver.findElement(By.linkText("Posts (Atom)"));
		
		//	selenium143text.click();
			
			
			// partial link text
	//	driver.findElement(By.partialLinkText("(Atom)")).click();
		
		
	}

}
