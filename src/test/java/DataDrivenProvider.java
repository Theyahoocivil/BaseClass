import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class DataDrivenProvider {
	
public static String[][] m1() throws IOException{
	 File f1 = new File("C:\\Users\\thiyagarajan\\Desktop\\InstaDataDriven.xlsx");
	FileInputStream file = new FileInputStream(f1);
	  
	 Workbook w = new XSSFWorkbook(file);
	 Sheet sheet = w.getSheet("Sheet1");
	 List<ArrayList<String>> obj = new ArrayList<ArrayList<String>>();
	 for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		 Row row = sheet.getRow(i);
		 ArrayList<String> rows = new ArrayList<String>();
		 for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
			 Cell cell = row.getCell(j);
			 CellType cellType = cell.getCellType();
			 String stringcellValue = "";
			 switch(cellType) {
			 case STRING :
				 stringcellValue = cell.getStringCellValue();
				 break;
				 default:
					 if(DateUtil.isCellDateFormatted(cell)) {
						 Date dateCellValue = cell.getDateCellValue();
						 SimpleDateFormat s = new SimpleDateFormat();
						 stringcellValue = s.format(dateCellValue);
						 
					 }else {
						 double numericCellValue = cell.getNumericCellValue();
						 long l =(long) numericCellValue;
						 BigDecimal valueOf = BigDecimal.valueOf(l);
						 stringcellValue = valueOf.toString();
					 }
			 }
			 rows.add(stringcellValue);
			 }
		 obj.add(rows);
	 }
	 String s[][]  = new String [obj.size()][obj.get(0).size()];
			for(int i=0;i<obj.size();i++) {
				ArrayList<String> arraylist = obj.get(i);
				for(int j=0;j<arraylist.size();j++) {
					s[i][j] = arraylist.get(j);
		 }
			}
			return s;
		 }


public static void main(String[] args) throws IOException {
	String[][] getdata = m1();
	for(int i=0;i<getdata.length;i++) {
		String[] string=getdata[i];
		for(int j=0;j<string.length;j++) {
			String string2 = getdata[i][j].toString();
			System.out.println(string2);
			}
	}	
}}




