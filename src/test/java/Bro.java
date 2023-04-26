
import org.testng.annotations.Test;

public class Bro extends BaseClass{
	@Test
public void Edge() {
	getDriver("edge");
	launchurl("https://www.flipkart.com/");
	locator("xpath", "//button[@class='_2KpZ6l _2doB4z']").click();
	
}	@Test
public void Chrome() {
	getDriver("chrome");
	launchurl("https://www.facebook.com/");
	locator("id", "email").sendKeys("deva");
	locator("id", "pass").sendKeys("Karthi");	
}
}
