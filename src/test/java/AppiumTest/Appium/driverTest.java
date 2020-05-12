package AppiumTest.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class driverTest {
	
	
	static AppiumDriver<WebElement> driver;

	public static void main(String[] args) {
		
		DriverConnect();
		test1();
	}

	private static void test1() {
		
		WebElement one = driver.findElementById("tv.tolka.vhometv:id/btn_one");
				   one.click();

	}

	public static void DriverConnect() {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("app", "D:\\\\VHomeTV_phone_20200416_v0.5.1.apk");
		dc.setCapability("appWaitActivity", "com.tolka.woctv.activity.s");
		dc.setCapability("appPackage", "tv.tolka.vhometv");
		
		
		try {
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AppiumDriver<WebElement>(url,dc);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
