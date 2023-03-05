package stepDefinitions;

import Pages.HomePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {
    public static final String COOKIE_ACCEPT = "it.lottomatica.lotto:id/btn_accept_cookies";
    public static final String DIECILOTTO_GIOCA_BTN = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[10]/android.view.View[2]/android.widget.Button[3]";
    public static final String TURN_BACK = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[11]/android.view.View[1]/android.view.View[1]";

    private WebDriver driver;

    public LoginSteps() {
        this.driver = Hooks.getDriver();
    }


    @Given("Open the application")
    public void openTheApplication() throws InterruptedException {
        Thread.sleep(10000);



    }

    @When("Cookies pop-up appears")
    public void cookiesPopUpAppears() {
        driver.findElement(By.id(COOKIE_ACCEPT));
    }

    @And("User click to close pop-up btn")
    public void userClickToClosePopUpBtn() {
        driver.findElement(By.id(COOKIE_ACCEPT)).click();

    }

    @And("User click to diecilotto btn")
    public void userClickToDiecilottoBtn() {
        driver.findElement(By.xpath(DIECILOTTO_GIOCA_BTN)).click();
    }

    @And("User click to turn back btn")
    public void userClickToTurnBackBtn() {
        driver.findElement(By.xpath(TURN_BACK)).click();
    }
}
