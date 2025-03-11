package com.selenium.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {

		  File file = new File("C:\\Users\\JAYA VYAWHARE\\Documents\\Book1.xlsx");
	      
	      FileInputStream ip= new FileInputStream(file);
	      
	      XSSFWorkbook workBook=new XSSFWorkbook(ip);
	      
	   //  XSSFSheet sh= workBook.getSheetAt(4);
	     
	     XSSFSheet sheet= workBook.getSheet("Sheet3");
	     
	    XSSFRow row= sheet.createRow(2);
	    sheet.getRow(2).createCell(1).setCellValue("John");
	        
	    FileOutputStream op= new FileOutputStream(file);
	    
	    workBook.write(op);
	    
	    workBook.close();
		
	}

}
