import org.openqa.selenium.WebElement;

public class Select extends BaseClass {
public static void main(String[] args) {
	
	getDriver("chrome");
	launchurl("https://adactinhotelapp.com/");
	WebElement locator = locator("id", "username");
	locator.sendKeys("thiyagu12");
	WebElement locator2 = locator("id", "password");
	locator2.sendKeys("Thiyagu@12");
	locator("id", "login").click();
	WebElement locator3 = locator("id", "location");
	select("visibleText", locator3, "Sydney");
	
	
}
}
