package appium_project;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.CanRecordScreen;

public class Mobile_screenRecord {
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
		
		startRecording();
		Thread.sleep(10000);
		stopRecording();
		
		
	}
	private static void startRecording() {
		try {
			((CanRecordScreen) driver).startRecordingScreen();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void stopRecording() {
		try {
			String media = ((CanRecordScreen)driver).stopRecordingScreen();
			if (media == null || media.isEmpty()) {
                System.out.println("No screen recording file found");
                return;
            }
			String dirPath = "C:\\Users\\noman\\Documents\\scope_India\\Automation";
			String fileName = "test.mp4";
			Path path = Paths.get(dirPath, fileName);
			Files.write(path, Base64.getDecoder().decode(media));
			//Files.write(path, Base64.getDecoder().decode(media));
			System.out.println("Screen recording saved to: " + path.toString());
		}catch (Exception e) {
            e.printStackTrace();
        }

	}

}
