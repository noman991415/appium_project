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
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Mobile_longPress {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
		URL url = new URL ("http://localhost:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url,capabilities);
		System.out.println("Phone run successfully");
		
		int startX=531;
		int startY=2001;
		int endX=482;
		int endY=576;
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
		Thread.sleep(2000);
		System.out.println("swip perform successfull");
		
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"ToDodo\"]"));
		//touchaction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element).w))
		touchAction.longPress(LongPressOptions.longPressOptions()
				.withElement(ElementOption.element(element))
				.withDuration(Duration.ofSeconds(5)));
				touchAction.release().perform();
				
				System.out.println("todo opended successfully");


	}

}
