import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\thiyagarajan\\Desktop\\Book132.xlsx");
//	FileInputStream file = new FileInputStream(f);
	Workbook w = new XSSFWorkbook();
//	Sheet sheet = w.getSheet("Sheet1");
//	Row row = sheet.getRow(0);
//	Cell cell = row.getCell(1);
//	String stringCellValue = cell.getStringCellValue();
//	System.out.println(stringCellValue);
//	
	
	
	Sheet createSheet = w.createSheet("sample");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(1);
	createCell.setCellValue("hi");
	FileOutputStream out = new FileOutputStream(f) ;
	w.write(out);
}
}
