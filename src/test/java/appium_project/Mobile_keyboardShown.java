package appium_project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile_keyboardShown {
	public static AndroidDriver<WebElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		
		TouchAction touchaction = new TouchAction(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement chromeIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"Chrome\"]")));
        chromeIcon.click();
		//WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Chrome\"]"));
		//element.click();
		
		
		Thread.sleep(2000);
		
		 WebElement searchBox = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]"));
	        searchBox.click();
		
		Thread.sleep(3000);
		driver.hideKeyboard();
        System.out.println("Keyboard hidden");
        Thread.sleep(3000);
        //driver.isKeyboardShown();
		//System.out.println("Keyboard shown");


	}

}
