package TestCases;


import DriverManager.DriverManagerType;
import DriverManager.DriverManager;
import Pages.BuyPage;
import Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;

//public class BaseTest {
//
//
//    public static WebDriver driver;
//    HomePage homePage;
//    BuyPage buyPage;
//
//
//    public static void setUp() {
//        try {
//            driver = DriverManager.getDriver(DriverManagerType.ANDROID);
////            homePage = new HomePage((AndroidDriver)driver);
////            buyPage = new BuyPage((AndroidDriver)driver);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void destroyDriver() {
//        //  driver.quit();
//    }
//}