package stepDefinitions;


import DriverManager.DriverManager;
import DriverManager.DriverManagerType;
import Pages.BuyPage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class BaseTest {


    public static WebDriver driver;
    HomePage homePage;


    public static void setUp() {
        try {
            driver = DriverManager.getDriver(DriverManagerType.ANDROID);
//            homePage = new HomePage((AndroidDriver)driver);
//            buyPage = new BuyPage((AndroidDriver)driver);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void destroyDriver() {
        //  driver.quit();
    }
}