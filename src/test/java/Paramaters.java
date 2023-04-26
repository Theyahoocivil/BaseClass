import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Paramaters extends BaseClass{
	
	@Parameters({ "browser" })
	@Test
	
public void Chrome() throws InterruptedException {
	getDriver("chrome");
	launchurl("https://www.instagram.com/");
	waits(); 
	WebElement locator = locator("xpath", "//span[text()='Sign up']");
	javaScript("jsClick", locator);
	//locator("xpath", "(//input[@class='_aa4b _add6 _ac4d'])[2]").sendKeys("qweyerrt");
	
}
//	@Parameters({"edge"})
//	@Test
//public void Edge() {
//	getDriver("chrome");
//	launchurl("https://www.instagram.com/");
//	locator("xpath", "//span[text()='Phone number, username, or email']").sendKeys("thiyagu");
//	locator("xpath", "//input[@type='password']").sendKeys("karthi");
//}
}
