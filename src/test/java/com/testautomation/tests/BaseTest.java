package com.testautomation.tests;

import org.testautomation.drivers.SeleniumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    public BaseTest() {

    }

    @BeforeMethod
    public void setUp() throws InterruptedException, Exception {
        SeleniumDriver.initializeDriver();
    }

    @AfterMethod
    public void tearDown() {
        //SeleniumDriver.quit();
        SeleniumDriver.quitDriver();
    }
    @AfterTest
    public void cleanProcess() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}