import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends BaseClass {
	@Test(dataProvider="pg")
	public void login(String a,String b) {
		
	getDriver("edge");
	launchurl("http://facebook.com/");
	pomClass p = new pomClass();
	p.getUsername().sendKeys(a);
	p.getPassword().sendKeys(b);
	p.getLogin().click();	
}
	@DataProvider(name="pg")
	public Object[][] provider() {
		return new Object[][] {
			{"9876542103","balaji"},
			{"karthi","arul"}
		};
	}
}
