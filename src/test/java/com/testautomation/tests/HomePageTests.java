package com.testautomation.tests;

import com.testautomation.helperfunctions.ClickFunctions;
import com.testautomation.helperfunctions.WaitForLoadingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.SeleniumDriver;
import org.testng.annotations.Test;

public class HomePageTests extends LoggingPageTests {

    ClickFunctions clickFunctions = new ClickFunctions();
    WaitForLoadingPage waiting = new WaitForLoadingPage();

    @Test
    public void navigateToTruckLoad() throws InterruptedException{
        loggingTest();
        Thread.sleep(10000);
        //clickFunctions.javaScriptClick(".LTLDropDownImage");
        WebDriver driver = SeleniumDriver.getSharedDriver();
        clickFunctions.javaScriptSharedDrClick(".LTLDropDownImage", driver);
        Thread.sleep(5000);
    }
}
