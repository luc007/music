package SaavnMusic.SaavnMusic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    
 
    @BeforeSuite
    public void setupAppium() throws MalformedURLException {
	final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
	url = new URL(URL_STRING);
	
	capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	capabilities.setCapability(MobileCapabilityType.APP, "https://apkpure.com/saavn-music-radio/com.saavn.android");
    }
 }
