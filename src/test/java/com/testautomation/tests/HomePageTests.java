package com.testautomation.tests;

import helperfunctions.ClickFunctions;
import helperfunctions.WaitForLoadingPage;
import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.DriverManager;
import org.testautomation.pages.HomePageGTZShip;
import org.testng.annotations.Test;

public final class HomePageTests extends BaseTest {

    ClickFunctions clickFunctions = new ClickFunctions();
    WaitForLoadingPage waiting = new WaitForLoadingPage();


    @Test
    public void navigateToTruckLoad() throws Exception {
        LoggingPageTestsGTZShip loggingPageTests = new LoggingPageTestsGTZShip();
        loggingPageTests.loggingTest();
        Thread.sleep(10000);
        //clickFunctions.javaScriptClick(".LTLDropDownImage");
        WebDriver driver = DriverManager.getSharedDriver();
        clickFunctions.javaScriptClick(".LTLDropDownImage", driver);
        Thread.sleep(5000);
    }

    @Test
    public void logOutFromHomePage() throws Exception {
        LoggingPageTestsGTZShip loggingPageTests = new LoggingPageTestsGTZShip();
        loggingPageTests.loggingTest();
        Thread.sleep(10000);
        HomePageGTZShip homePageGTZShip = new HomePageGTZShip();
        homePageGTZShip.signOutFromGTZShipHomePage();
        Thread.sleep(10000);
    }
}
