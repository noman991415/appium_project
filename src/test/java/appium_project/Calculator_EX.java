package appium_project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator_EX {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
		
		capabilities.setCapability("appPackage","com.android2.calculator3");
		capabilities.setCapability("appActivity","com.xlythe.calculator.material.Theme.Orange");
		
		URL url = new URL ("http://localhost:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url,capabilities);
		
		WebElement digit_6 = driver.findElement(By.id("com.android2.calculator3:id/digit_6"));
		digit_6.click();
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.id("com.android2.calculator3:id/op_add"));
		add.click();
		Thread.sleep(2000);
		WebElement digit_4 = driver.findElement(By.id("com.android2.calculator3:id/digit_4"));
		digit_4.click();
		Thread.sleep(2000);
		
		System.out.println("Finish");
	}
}
