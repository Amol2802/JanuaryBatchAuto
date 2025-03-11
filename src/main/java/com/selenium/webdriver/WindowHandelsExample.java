package com.selenium.webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelsExample {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Windows.html");

			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			String parrentWindow= driver.getWindowHandle();
			System.out.println(parrentWindow);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
			Thread.sleep(2000);
		//	driver.findElement(By.xpath("//span[normalize-space(text())='Projects']")).click();
			
			Set<String> windows=driver.getWindowHandles();
			
			for(String s:windows) {
				System.out.println(s);
				
				driver.switchTo().window(s);   // switching the windows using id
				System.out.println(driver.getTitle());
				
				if(driver.getTitle().equals("Selenium")) {
					
					driver.switchTo().window(s);
					
					driver.findElement(By.xpath("//span[normalize-space(text())='Projects']")).click();
				}
				
			}
			
			
	}

}
