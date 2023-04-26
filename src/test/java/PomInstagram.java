

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomInstagram extends BaseClass {
private void insta() {
	PageFactory.initElements(Driver, this);
}
@FindBy(xpath="//input[@aria-label='Mobile Number or Email']")
private WebElement mobileNumber;
@FindBy(xpath="//input[@aria-label='Full Name']")
private WebElement fullName;
	@FindBy(xpath="//input[@aria-label='Username']")
	private WebElement username;
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement Password;
	@FindBy(xpath="//button[text()='Log in with Facebook']")
	private WebElement signup;

public WebElement getMobileNumber() {
	return mobileNumber;
}
public WebElement getFullName() {
	return fullName;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return Password;
}public WebElement getSignup() {
	return signup;
}
}
