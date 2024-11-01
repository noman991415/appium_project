package appium_project;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Mobile_notification {
	public static AndroidDriver<WebElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
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
				
				driver.openNotifications();
				System.out.println("Open notification Successfull");
				
				try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				TouchAction action = new TouchAction(driver);
		        action.press(PointOption.point(330, 2197)) // Starting point (depends on screen resolution)
		              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))) // Optional pause
		              .moveTo(PointOption.point(330, 339)) // Ending point (swiping up)
		              .release()
		              .perform();

		        System.out.println("Notification panel closed successfully");

	}

}
