package Pages;

import actionHelper.AndroidHelperMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

class BasePageClass {
    protected AndroidDriver androidDriver;
    AndroidHelperMethods androidHelperMethods;

    public BasePageClass(AndroidDriver driver) {
        this.androidDriver = driver;

        Duration DEFAULT_WAITING_TIMEOUT = Duration.ofSeconds(20L);

        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, DEFAULT_WAITING_TIMEOUT), this);
        androidHelperMethods= new AndroidHelperMethods(androidDriver);
    }
}
