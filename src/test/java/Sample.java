import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		File f  = new File("D:\\Datata\\Sample.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Sheet1");
		for(int i=0; i<rows.size(); i++) {
			WebElement row = rows.get(i);
			Row createRow = createSheet.createRow(i);
			List<WebElement> datas = row.findElements(By.tagName("td"));
			for(int j=0; j<datas.size();j++) {
				WebElement webElement = datas.get(j);
				String text = webElement.getText();
				Cell createCell = createRow.createCell(j);
				createCell.setCellValue(text);
			}
		}
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
	}

}
