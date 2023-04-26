

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Android {

public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\thiyagarajan\\Desktop\\A.apk");
	URL u = new URL("http://0.0.0.0:4723/wd/hub");
	AndroidDriver<WebElement> androidDriver = new AndroidDriver<WebElement>(u,dc);
}
}
