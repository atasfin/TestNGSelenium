package org.testautomation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testautomation.constants.ProjectConstants;
import org.testautomation.utils.ReadPropertyFiles;

import java.io.IOException;
import java.util.Objects;

public final class SeleniumDriver {

    public SeleniumDriver() {

    }
    //public static WebDriver driver;

    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (Objects.isNull(DriverManager.getSharedDriver())) {
            System.setProperty("webdriver.chrome.driver", ProjectConstants.getChromeDriverPath());
            driver = new ChromeDriver();
        }
        return driver;
    }


    //    public Driver(){
//    }
    public static void initializeDriver() throws Exception {

        if (Objects.isNull(DriverManager.getSharedDriver())) {
            System.setProperty("webdriver.chrome.driver", ProjectConstants.getChromeDriverPath());
            WebDriver driver = new ChromeDriver();
            //driver = new ChromeDriver();
            DriverManager.setSharedDriver(driver);
            //DriverManager.getSharedDriver().get("https://stage2-carrierrate.globaltranz.com/CR2/Account/Login/");
            DriverManager.getSharedDriver().get(ReadPropertyFiles.getPropertyValues("url"));
        }
    }

    public static void bringWebPage(String URL) {
        DriverManager.getSharedDriver().get("https://stage2-carrierrate.globaltranz.com/CR2/Account/Login/");
        //driver.get("URL");
    }

    public static void quitDriver() {
        //if(driver!=null)
        if (Objects.nonNull(DriverManager.getSharedDriver())) {
            DriverManager.getSharedDriver().close();
            DriverManager.getSharedDriver().quit();
//        setSharedDriver(null);
            DriverManager.cleanSharedDriver();
        }
    }
}
