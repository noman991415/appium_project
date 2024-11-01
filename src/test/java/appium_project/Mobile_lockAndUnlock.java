package appium_project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile_lockAndUnlock {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
		//URL url = new URL ("http://localhost:4723/wd/hub");
		//AppiumDriver driver = new AppiumDriver(url,capabilities);
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),capabilities);

		System.out.println("Phone run successfully");
		
		driver.unlockDevice();
		System.out.println("device unlocked");
		Thread.sleep(2000);
		//driver.lockDevice();
		//System.out.println("device locked");



	}

}
