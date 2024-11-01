package appium_project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class todo_swipClick {

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
		TouchAction touchaction = new TouchAction(driver);
		touchaction.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
		Thread.sleep(3000);
		System.out.println("swip perform successfull");
	
		WebElement todo = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"ToDodo\"]"));
		todo.click();
		Thread.sleep(3000);
		
		WebElement menu = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
		menu.click();
		Thread.sleep(3000);
		
		WebElement about = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.mdev.tododo:id/tv_nav_draw_about\"]"));
		about.click();
		Thread.sleep(2000);
		//driver.quit();


	}

}
