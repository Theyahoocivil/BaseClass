import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Driven extends BaseClass{
public static void main(String[] args) {
	getDriver("chrome");
	String webElement ="";
	launchurl("https://www.google.com/search?q=ipl+table+2022&rlz=1C1CHBF_en-GBIN1049IN1049&sxsrf=AJOqlzWEk19fLYvYqxNUn9AgiotTEaQMeA%3A1679669204837&ei=1LcdZNzMMu2mseMP7JOMmAw&ved=0ahUKEwjchq2y5_T9AhVtU2wGHewJA8MQ4dUDCBA&uact=5&oq=ipl+table+2022&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzILCAAQgAQQsQMQgwEyCggAEIAEEBQQhwIyBQgAEIAEMgUIABCABDIFCAAQgAQyBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeOgoIABBHENYEELADOgoIABCKBRCwAxBDOg8ILhCKBRDIAxCwAxBDGAE6EgguEIoFENQCEMgDELADEEMYAToECCMQJzoHCAAQigUQQ0oECEEYAFD9A1j3B2CiC2gBcAF4AIABeogB4AGSAQMwLjKYAQCgAQHIARLAAQHaAQYIARABGAg&sclient=gws-wiz-serp");
	WebElement locator = locator("xpath", "//div[@class='sWfpOe']");
	List<WebElement> allrows = locator.findElements(By.tagName("tr"));
	List<String> ls = new ArrayList<String>();
	
	int rows = allrows.size();
	//System.out.println(rows);
	for(WebElement row : allrows){

		String text = row.getText();
		
		ls.add(text);
//		System.out.println(text);
	}
  for(int i=0;i<ls.size();i++) {
	  String string = ls.get(i);
	  System.out.println(string);
  }
}
}
