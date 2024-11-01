package appium_project;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile_screenShot {
	public static AndroidDriver<WebElement> driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
		URL url = new URL ("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, capabilities);
		//AppiumDriver driver = new AppiumDriver(url,capabilities);
		System.out.println("Phone run successfully");
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\noman\\Documents\\scope_India\\Automation\\screenshot.png"));
		System.out.println("screenshot saved successfully");
		
		driver.openNotifications();
		System.out.println("open notification successfully");


	}

}
