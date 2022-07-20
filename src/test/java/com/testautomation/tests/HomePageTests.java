package com.testautomation.tests;

import org.testautomation.helperfunctions.ClickFunctions;
import org.testautomation.helperfunctions.WaitForLoadingPage;
import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.DriverManager;
import org.testautomation.pages.HomePageGTZShip;
import org.testautomation.pages.NavigationMenuGTZShip;
import org.testng.annotations.Test;

public final class HomePageTests extends BaseTest {

    ClickFunctions clickFunctions = new ClickFunctions();
    WaitForLoadingPage waiting = new WaitForLoadingPage();
    NavigationMenuGTZShip navigationMenuGTZShip = new NavigationMenuGTZShip();


    @Test
    public void navigateToTruckLoad() throws Exception {
        LoggingPageTestsGTZShip loggingPageTests = new LoggingPageTestsGTZShip();
        loggingPageTests.loggingTest();
        Thread.sleep(10000);
        //WebDriver driver = DriverManager.getSharedDriver();
        navigationMenuGTZShip.hoveOverRatingMenuGTZShip();
        navigationMenuGTZShip.navigateToLTLShipPage();
        Thread.sleep(5000);
    }

    @Test
    public void logOutFromHomePage() throws Exception {
        navigateToTruckLoad();
        HomePageGTZShip homePageGTZShip = new HomePageGTZShip();
        navigationMenuGTZShip.hoveOverLogOutMenu();
        navigationMenuGTZShip.SignOutFromLTLShipPage();
        Thread.sleep(10000);
    }
}
