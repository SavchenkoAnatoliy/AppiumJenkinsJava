package stepDefinitions;

import DriverManager.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidMobileCommandHelper;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {
    Properties properties;
    static DesiredCapabilities capabilities;
    private static WebDriver driver;

    @Before("@appium")
    public void setUpAppium() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage", "it.lottomatica.lotto");
        capabilities.setCapability("appActivity", "it.lottomatica.lotto.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("avd", "Pixel_5_API_31");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("app", System.getProperty("user.dir") + "//src//main//" + "resources//apk//11926.apk");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "5000");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    public void destroyDriver() {
        //  driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
