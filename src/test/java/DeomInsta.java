import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeomInsta extends BaseClass {
	@DataProvider(name="signup")
	private Object [][] getData() throws IOException{
		String[][] m1 = DataDrivenProvider.m1();
		return m1;
	}
	@Test(dataProvider = "signup")
public static void m2(String a,String b,String c,String d) throws InterruptedException {
	getDriver("edge");
	launchurl("https://www.instagram.com/accounts/emailsignup/");
	PomInstagram p = new PomInstagram();
	WebElement mobileNumber = p.getMobileNumber();
	Thread.sleep(3000);
	mobileNumber.sendKeys(a);
	WebElement fullName = p.getFullName();
	fullName.sendKeys(b);
	WebElement username = p.getUsername();
	username.sendKeys(c);
	WebElement password = p.getPassword();
	password.sendKeys(d);
	p.getSignup().click();

}}
