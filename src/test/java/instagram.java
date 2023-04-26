

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class instagram extends BaseClass {
	@DataProvider(name="testing")
	private Object [][] getDatas(){
		return new Object[][]{
		{"9876543120","thiyagu","Thiyagu","Thiyagu"}
		};}
	@Test(dataProvider = "testing")
public void signup( String a,String b , String c , String d) throws InterruptedException {
		
	getDriver("chrome");
	Thread.sleep(5000);
	launchurl("https://www.instagram.com/accounts/emailsignup/");
	Thread.sleep(5000);
	PomInstagram p = new PomInstagram();
	Thread.sleep(5000);
	p.getMobileNumber().sendKeys(a);
	Thread.sleep(5000);
	p.getFullName().sendKeys(b);
	Thread.sleep(5000);
	p.getUsername().sendKeys(c);
	Thread.sleep(5000);
	p.getPassword().sendKeys(d);
	Thread.sleep(5000);
	p.getSignup().click();
	}}
	
	


