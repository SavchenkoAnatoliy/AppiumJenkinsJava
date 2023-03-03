package Pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePageClass {

    public static final String CONTINUE_BTN = "com.nobroker.app:id/bottomPermission";
    public static final String BUY_BTN ="com.nobroker.app:id/buyLayout";
    public static final String SEARCH_BTN="com.nobroker.app:id/searchEditBar";

    //MyLOT Cookie Accept
    public static final String COOKIE_ACCEPT = "it.lottomatica.lotto:id/btn_accept_cookies";
    public static final String DIECILOTTO_GIOCA_BTN = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[10]/android.view.View[2]/android.widget.Button[3]";
    public static final String TURN_BACK = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[11]/android.view.View[1]/android.view.View[1]";

    @AndroidFindBy(xpath = TURN_BACK)
    WebElement turn_back_Btn;

    public void turn_back_Btn_click() {
        androidHelperMethods.click(turn_back_Btn);
    }

    @AndroidFindBy(xpath = DIECILOTTO_GIOCA_BTN)
    WebElement diecilotto_gioca_Btn;

    public void diecilottoGioca_Btn_click() {
        androidHelperMethods.click(diecilotto_gioca_Btn);
    }

    @AndroidFindBy(id = COOKIE_ACCEPT)
    WebElement allowCoookie_Btn;

    public void allowCookie_Btn() {
        androidHelperMethods.click(allowCoookie_Btn);
    }


    //////////////////////////////////////////////////////////
    @AndroidFindBy(id = CONTINUE_BTN)
    WebElement allowContinue_Btn;

    @AndroidFindBy(id = BUY_BTN)
    WebElement but_Btn;

    @AndroidFindBy(id = SEARCH_BTN)
    WebElement search_Btn;

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public void allowContinue_Btn() {
        androidHelperMethods.click(allowContinue_Btn);
    }

    public void buyBtn() {
        androidHelperMethods.click(but_Btn);
    }

    public void search_Btn() {
        androidHelperMethods.click(search_Btn);
    }
}
