package pages;

import java.io.File;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class startAppium {

	@Test
	public void AppiumTest() throws MalformedURLException
	{
		
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setDeviceName("Supriya");
//		options.setApp("C://Users//Admin//eclipse-workspace//TobiUI//src//test//java//resources//ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appium-version", "2.1.3");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"14.0");
		cap.setCapability("aap.package", "io.appium.android.apis");
		cap.setCapability("app.activity", "io.appium.android.apis.ApiDemos");
		cap.setCapability(MobileCapabilityType.NO_RESET, "true");
		cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
		cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("autoAcceptAlerts", "true");
        
		
		
		cap.setCapability(MobileCapabilityType.APP, "C://Users//Admin//eclipse-workspace//TobiUI//src//test//java//resources//ApiDemos-debug.apk");
		AppiumDriver driver = new AppiumDriver(new URL("http://192.168.0.106:4723"), cap);
		driver.quit();
		//service.stop();
	}

}
