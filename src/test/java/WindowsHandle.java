import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

public class WindowsHandle extends BaseClass {
public static void main(String[] args) throws IOException {
	getDriver("chrome");
//	launchurl("https://www.flipkart.com/");
//	Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	locator("xpath", "//button[@class='_2KpZ6l _2doB4z']").click();
//	actions("mouseOver", "//div[text()='Home']");
//	actions("mouseOver", "//a[text()='Furniture Studio']").click();
//	WebElement locator2 = locator("xpath", "(//div[@class='_3LU4EM'])[2]");
//	locator2.click();
//	WebElement locator3 = locator("xpath", "(//a[@class='s1Q9rs'])[1]");
//	locator3.click();
//	GetWindowsHandle();
//	locator("xpath", "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']").click();
	launchurl("https://www.google.com/search?q=ipl+table+2022&rlz=1C1CHBF_en-GBIN1049IN1049&oq=ipl&aqs=chrome.3.69i57j46i131i433i512j69i59l2j0i131i433i512l6.4054j0j15&sourceid=chrome&ie=UTF-8");
	WebTableToXl("C:\\Users\\thiyagarajan\\Desktop\\Book2.xlsx", "Sampl23", "(//div[@class='jXpA9e Ui5IUc'])[1]");


}
}
