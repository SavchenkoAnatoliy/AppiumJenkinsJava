package testrunners;

//import TestCases.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json"}
        ,features = {"Features"}
        ,glue = {"stepDefinitions"}
        ,dryRun=false
        ,monochrome=true
//        ,tags = ("@appium")

)
public class TestRunner {


//        @BeforeClass
//        public static void initialize() throws Exception {
//            BaseTest.setUp();
//        }
//
//        @AfterClass
//        public static void quit(){
//            BaseTest.driver.quit();
//
//        }
    }
