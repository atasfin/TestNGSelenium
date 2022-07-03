package org.testautomation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testautomation.constants.ProjectConstants;

import java.util.Objects;

public class SeleniumDriver {

    public static WebDriver driver;

    public static ThreadLocal<WebDriver> sharedDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if(Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", ProjectConstants.getChromeDriverPath());
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriver getSharedDriver(){
        return sharedDriver.get();
    }

    public static void setSharedDriver(WebDriver driverRef){
        sharedDriver.set(driverRef);
    }

//    public Driver(){
//    }
    public static void initializeDriver()  {
        if(Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", ProjectConstants.getChromeDriverPath());
            driver = new ChromeDriver();
            setSharedDriver(driver);
            getSharedDriver().get("https://stage2-carrierrate.globaltranz.com/CR2/Account/Login/");
            //getDriver().get("https://stage2-carrierrate.globaltranz.com/CR2/Account/Login/");
            //Thread.sleep(10000);
        }
    }

    public static void cleanSharedDriver(){
        sharedDriver.remove();
    }

    public static void bringWebPage(String URL){
        driver.get("https://stage2-carrierrate.globaltranz.com/CR2/Account/Login/");
        //driver.get("URL");
    }

    public static void quitDriver(){
        //f(driver!=null)
        if(sharedDriver!=null){
        getSharedDriver().close();
        getSharedDriver().quit();
        cleanSharedDriver();
        }
    }
}
