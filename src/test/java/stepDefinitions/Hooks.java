package stepDefinitions;

import DriverManager.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidMobileCommandHelper;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Hooks {
    Properties properties;
    static DesiredCapabilities capabilities;
    private static WebDriver driver;
    public AppiumDriverLocalService service;
    public static String NodeExePath = "C:\\Program Files\\nodejs\\node.exe";
    public static String AppiumMainJSPath = "C:\\Program Files\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";

    @Before
    public void setUpAppium() throws MalformedURLException, InterruptedException {
//        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//                        .usingDriverExecutable(new File(NodeExePath)).withAppiumJS(new File(AppiumMainJSPath)).withIPAddress("127.0.0.1")
//                        .withArgument(GeneralServerFlag.BASEPATH, "/wb/hub")
//                .usingPort(4723).withTimeout(Duration.ofSeconds(60))); // set the port number
//
//        service.start(); // start the server
//        Thread.sleep(15000);

//        service = AppiumDriverLocalService.buildDefaultService();
//        service.start();
//        assertEquals(true, service.isRunning());

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
//        service.stop();
        //  driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
