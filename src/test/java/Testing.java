import org.openqa.selenium.WebElement;

public class Testing extends BaseClass{
public static void main(String[] args) {
	getDriver("chrome");
	launchurl("https://www.facebook.com/");
	
	pomClass p = new pomClass();
	
	WebElement username = p.getUsername();
	username.sendKeys("thiyagarajan@gmial.com");
	
	WebElement password = p.getPassword();
	password.sendKeys("123456789");
	
	WebElement login = p.getLogin();
	login.click();
	
		
}
}
