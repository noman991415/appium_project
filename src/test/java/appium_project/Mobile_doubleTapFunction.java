package appium_project;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Mobile_doubleTapFunction {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
		URL url = new URL ("http://localhost:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url,capabilities);
		System.out.println("Phone run successfully");
		
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Files\"]"));
		TouchAction touchaction=new TouchAction(driver);
		TapOptions tapOptions = new TapOptions().withElement(ElementOption.element(element));
		touchaction.tap(tapOptions).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).tap(tapOptions).perform();
		
		System.out.println("Double tap perform successfully");

	}

}
