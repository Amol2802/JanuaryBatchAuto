package com.selenium.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelSheetData {

	public static void main(String[] args) throws IOException, InterruptedException {

      File file = new File("C:\\Users\\JAYA VYAWHARE\\Documents\\Book1.xlsx");
      
      FileInputStream ip= new FileInputStream(file);
      
      XSSFWorkbook workBook=new XSSFWorkbook(ip);
      
     XSSFSheet sheet= workBook.getSheetAt(4);
     
   //  XSSFSheet sheet= workBook.getSheet("data");
      
     String userName=sheet.getRow(1).getCell(0).getStringCellValue();
     System.out.println(userName);
      
     String password=sheet.getRow(1).getCell(1).getStringCellValue();
		
     System.out.println(password);
     
     WebDriver driver = new ChromeDriver();
 	//	WebDriver driver = new FirefoxDriver();
 	
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		driver.manage().window().maximize();
 	
 	//	driver.manage().window().minimize();
 		 Thread.sleep(2000);
 		driver.findElement(By.name("username")).sendKeys(userName);
 	    Thread.sleep(1000);
 		driver.findElement(By.name("password")).sendKeys(password);
 		Thread.sleep(1000);
 	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
 		
 		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium")).click();
     
     
    /* int rowCount=sheet.getLastRowNum();
     System.out.println(rowCount);
     
     int columnCount=sheet.getRow(0).getLastCellNum();
     
     System.out.println(columnCount);
     
	for (int r=0; r<rowCount; r++)	{
		
		for(int c=0; c<columnCount; c++) {
			
			String Value=sheet.getRow(r).getCell(c).getStringCellValue();
			System.out.print(Value +"                   ");
		}
		
		System.out.println();*/
		
	

	}

}
