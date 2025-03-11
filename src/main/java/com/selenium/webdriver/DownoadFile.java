package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownoadFile {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://sourceforge.net/projects/geckodriver.mirror/");

		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		
		
	}

}
