
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMain extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	
	getDriver("chrome");
	launchurl("https://www.FlipKart.com/");
	Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	locator("xpath", "//button[@class='_2KpZ6l _2doB4z']").click();
//	actions("mouseOVer", "//div[text()='Home']");
//	actions("mouseOVer", "//a[text()='Kitchen & Dining']");
//	actions("mouseOver", "//a[text()='Cookware']").click();
//	actions("doubleClick", "//a[text()='Cookware']");
//	//screenShot("C:\\Users\\thiyagarajan\\Desktop\\java\\A.png");
//	//locator("xpath", "//input[@title='Search for products, brands and more']");
	//attribute("//input[@title='Search for products, brands and more']", "iphone");
	//attribute(  "iphone","//input[@title='Search for products, brands and more']" , "xpath");
	//attribute(findElement, "//input[@title='Search for products, brands and more']", "iphone");
	getAttribute(findElement, "iphone", "xpath", "//input[@title='Search for products, brands and more']", "value");
	getText(findElement, "xpath", "//div[text()='Plain Cases & Covers']");



}
}	
