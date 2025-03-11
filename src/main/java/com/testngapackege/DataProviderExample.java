package com.testngapackege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
	}

	@AfterClass
	void tearDown() {

		driver.close();
	}

	@Test(dataProvider = "datapro")
	void login(String uname, String password) throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium")).click();
	}

	@DataProvider(name = "datapro", indices= {1,3})
	Object[][] datageneratore() {

		Object data[][] = { { "admon424", "A@5653" }, 
				{ "admin774", "Tsgtb536" }, 
				{ "admin7878", "pqr846" },
				{ "Admin", "admin123" },

		};

		return data;

	}

	@DataProvider(name = "datapro1")
	Object[][] datageneratore1() {

		Object data[][] = { { "admon424", "A@5653" }, { "admin774", "Tsgtb536" }, { "admin7878", "pqr846" },
				{ "Admin", "admin123" },

		};

		return data;

	}

}
