package pages;

import java.io.File;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class startAppium {
	public AppiumDriverLocalService service;
	@Test
	public void AppiumTest() throws MalformedURLException
	{
		File  path =new File ("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		service = new AppiumServiceBuilder().withAppiumJS(path).withIPAddress("127.0.0.1").usingPort(4723)
				.withTimeout(Duration.ofSeconds(5000)).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Supriya");
		options.setApp("C://Users//Admin//eclipse-workspace//TobiUI//src//test//java//resources//ApiDemos-debug.apk");
		
		AppiumDriver driver = new AppiumDriver(new URL("http://192.168.0.106:4723"), options);
		driver.quit();
		service.stop();
	}

}
