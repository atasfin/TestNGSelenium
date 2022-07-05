package com.testautomation.tests;

import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.SeleniumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.sql.Driver;

public class BaseTest {

    //WebDriver driver = SeleniumDriver.getDriver();
    //WebDriver sharedDriver = SeleniumDriver.getSharedDriver();
    public BaseTest() {

    }

    @BeforeMethod
    public void setUp() throws InterruptedException, Exception {
        //driver.get("https://stage2-carrierrate.globaltranz.com/CR2/Account/Login/");
        SeleniumDriver.initializeDriver();
        //sharedDriver.get("https://stage2-carrierrate.globaltranz.com/CR2/Account/Login/");
    }

    @AfterMethod
    public void tearDown() {
        //SeleniumDriver.quit();
        SeleniumDriver.quitDriver();
    }
}