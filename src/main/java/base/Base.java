package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

protected static MobileDriver<AndroidElement> driver ;
	

	public Base() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@Parameters({"deviceName","platformName"})
	@BeforeClass
	public void setUp(@Optional("Pixel_3a_API_30_x86")String device,@Optional("Android") String operatingSystem) throws MalformedURLException {
		
		if(operatingSystem.equalsIgnoreCase("android")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.DEVICE_NAME,device);
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME,operatingSystem);
			caps.setCapability("appPackage","com.todoist");
			caps.setCapability("appActivity","com.todoist.alias.HomeActivityDefault");
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
