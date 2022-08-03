package com.testautomation.tests;

import org.testautomation.pages.NavigationMenuGTZShip;
import org.testng.annotations.Test;

public final class HomePageTests extends BaseTest {

    NavigationMenuGTZShip navigationMenuGTZShip = new NavigationMenuGTZShip();


    @Test (priority = -1)
    public void navigateToLeastTruckLoad() throws Exception {
        LoggingPageTestsGTZShip loggingPageTests = new LoggingPageTestsGTZShip();
        loggingPageTests.loggingTest();
        Thread.sleep(10000);
        navigationMenuGTZShip.hoveOverRatingMenuGTZShip();
        navigationMenuGTZShip.navigateToLTLShipPage();
        Thread.sleep(5000);
    }

    @Test (priority = 1)
    public void logOutFromHomePage() throws Exception {
        navigateToLeastTruckLoad();
        navigationMenuGTZShip.hoveOverLogOutMenu();
        navigationMenuGTZShip.SignOutFromLTLShipPage();
        Thread.sleep(10000);
    }
}
