import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class GreensMouse extends BaseClass {

	
	public static void main(String[] args) {
		
		getDriver("chrome");
		launchurl("http://www.greenstechnologys.com/");
		actions("mouseOver", "//a[text()='COURSES']");
		List<WebElement> findElements = Driver.findElements(By.tagName("ul"));
		for(int i=0;i<findElements.size();i++) {
			  WebElement webElement = findElements.get(i);
			  String text = webElement.getText();
			System.out.println(text);
		
		}
		
		WebElement actions = actions("mouseOver", "//a[text()='Online Courses']");
		JavascriptExecutor js =(JavascriptExecutor) Driver;
		
		List<WebElement> onlineCourse = Driver.findElements(By.tagName("ul"));
		//js.executeScript("arguments[0].setAttributes('style','background:red;border:solid 6px yellow')", onlineCourse);
		for(int i=0;i<onlineCourse.size();i++) {
			  WebElement webElement = onlineCourse.get(i);
			  String text = webElement.getText();
			System.out.println(text);
		}
		actions("mouseOver", "//a[text()='Master Program']");
		List<WebElement> master= Driver.findElements(By.tagName("ul"));
		for(int i=0;i<master.size();i++) {
			  WebElement webElement = master.get(i);
			  String text = webElement.getText();
			System.out.println(text);
		}}}
	
