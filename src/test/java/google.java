import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class google extends BaseClass {
public static void main(String[] args) {
	getDriver("chrome");
	launchurl("https://www.google.com/");
	List<WebElement> findElements = Driver.findElements(By.tagName("a"));
	for(int i=5;i<findElements.size();i++) {
		WebElement webElement = findElements.get(i);
		String text = webElement.getText();
		System.out.println(text);
	}
}
}
