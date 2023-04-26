import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

public class WebTable extends BaseClass {
public static void main(String[] args) throws IOException {
	getDriver("chrome");

	launchurl("https://www.google.com/search?q=ipl+table+2022&rlz=1C1CHBF_en-GBIN1049IN1049&sxsrf=AJOqlzWEk19fLYvYqxNUn9AgiotTEaQMeA%3A1679669204837&ei=1LcdZNzMMu2mseMP7JOMmAw&ved=0ahUKEwjchq2y5_T9AhVtU2wGHewJA8MQ4dUDCBA&uact=5&oq=ipl+table+2022&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzILCAAQgAQQsQMQgwEyCggAEIAEEBQQhwIyBQgAEIAEMgUIABCABDIFCAAQgAQyBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeOgoIABBHENYEELADOgoIABCKBRCwAxBDOg8ILhCKBRDIAxCwAxBDGAE6EgguEIoFENQCEMgDELADEEMYAToECCMQJzoHCAAQigUQQ0oECEEYAFD9A1j3B2CiC2gBcAF4AIABeogB4AGSAQMwLjKYAQCgAQHIARLAAQHaAQYIARABGAg&sclient=gws-wiz-serp");
	WebElement locator = locator("xpath", "//div[@class='sWfpOe']");
	List<WebElement> rows = locator.findElements(By.tagName("tr"));
//	JavascriptExecutor js =(JavascriptExecutor) Driver;
//	js.executeScript("arguments[0].setAttributes('style',background:red;border:solid 6px yellow')", rows);

	File file = new File("C:\\Users\\thiyagarajan\\Desktop\\Book3.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook w = new XSSFWorkbook();
	Sheet createSheet = w.createSheet("sample3");
	for(int i=0;i<rows.size();i++) {
	WebElement row = rows.get(i);
	Row createRow = createSheet.createRow(i);
	List<WebElement> datas = row.findElements(By.tagName("td"));
	for(int j=0;j<datas.size();j++) {
		WebElement webElement = datas.get(j);
		String text = webElement.getText();
		Cell createCell = createRow.createCell(j);
		createCell.setCellValue(text);
	}
	FileOutputStream out = new FileOutputStream(file);
	w.write(out);
	}}	}
	
	
//	//System.out.println(rows);
//	for(WebElement row : allrows){
//		String text = row.getText();
//		System.out.println(text);
//
//
//		
//		Row createRow = createSheet.createRow(i);
//	
//	Cell createCell = createRow.createCell(0);
//	createCell.setCellValue(text);
//	}
//FileOutputStream out = new FileOutputStream(file);
//w.write(out);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
//		List<WebElement> allcells = row.findElements(By.tagName("td"));
//		for(int i=0;i<allcells.size();i++) {
//			 webElement = allcells.get(i).getText();
//			
//			 //System.out.println(webElement);
//			 
//			}
//		
//		
//	}		File file = new File("C:\\Users\\thiyagarajan\\Desktop\\Book3.xlsx");
//	FileInputStream f = new FileInputStream(file);
//	Workbook w = new XSSFWorkbook(f);
//	Sheet sheet = w.getSheet("Sheet1");
//	for(int i=0;i<webElement.length();i++) {
//		Row row = sheet.createRow(i);
//		Cell createCell = row.createCell(0);
//		createCell.setCellValue(webElement);
//		
//		}
//	FileOutputStream out = new FileOutputStream(file);
//	w.write(out);

	
		

		
		
		
		
		
		
		
		
		
		
		//System.out.println(findElement.getSize());
//		if(allcells.size()>1) {
//			for(WebElement cell:allcells ) {
//				String text = cell.getText();
//				if(text.length()>2) {
//					String value = cell.getText();
//					a=value;
//					//System.out.println(value);
//				}
//			}}
//			// locate the test xl file				
//			  File file = new File("C:\\Users\\thiyagarajan\\Desktop\\workspace\\BaseClass\\Book1.xlsx");				
//			  // create input stream				
//			  FileInputStream fis = new FileInputStream(file);				
//			  // create workbook				
//			  Workbook wb = new XSSFWorkbook(fis);				
//			  // get sheet				
//			   Sheet sheet = wb.getSheet("demo");
//			   
//			   Row row2 = sheet.getRow(0);							
//			   Cell cell = row2.getCell(0);				
//			   if (cell == null) {				
//			    cell = row2.createCell(0);				
//			   			
//			   cell.setCellValue(a);
//			   System.out.println(a);
//			   FileOutputStream out = new FileOutputStream(file);
//			   wb.write(out);

	
	
	
	
	
	
	//	for(int i=0;i<findElements.size();i++) {
//		String webElement = findElements.get(i).getText();
		
		
		
		
		
		
		
		
//		
//		File file = new File("C:\\Users\\thiyagarajan\\Desktop\\New folder\\Book1.xlsx");
//		FileInputStream f =new FileInputStream(file);
//Workbook w = new XSSFWorkbook(file);
//Sheet sheet = w.createSheet("sample");
//
//		for(int j=0;j<webElement.length();j++) {
//			 Row row = sheet.getRow(j);
//			 for(int k=0;k<webElement.length();k++) {
//				 Cell cell = row.getCell(k);
//				 cell.setCellValue(webElement);
//			 }
//		 }
//		FileOutputStream out = new FileOutputStream(file);
//		w.write(out);
	
	


