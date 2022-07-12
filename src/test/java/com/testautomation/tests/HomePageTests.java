package com.testautomation.tests;

import com.testautomation.helperfunctions.ClickFunctions;
import com.testautomation.helperfunctions.WaitForLoadingPage;
import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.DriverManager;
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
        clickFunctions.javaScriptSharedDrClick(".LTLDropDownImage", driver);
        Thread.sleep(5000);
    }
}
