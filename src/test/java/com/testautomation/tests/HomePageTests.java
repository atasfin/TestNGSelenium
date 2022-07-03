package com.testautomation.tests;

import com.testautomation.helperfunctions.ClickFunctions;
import com.testautomation.helperfunctions.WaitForLoadingPage;
import org.testng.annotations.Test;

public class HomePageTests extends LoggingPageTests {

    ClickFunctions clickFunctions = new ClickFunctions();
    WaitForLoadingPage waiting = new WaitForLoadingPage();

    @Test
    public void navigateToTruckLoad() throws InterruptedException{
        loggingTest();
        Thread.sleep(10000);
        //clickFunctions.javaScriptClick(".LTLDropDownImage");
        clickFunctions.javaScriptSharedDrClick(".LTLDropDownImage");
        Thread.sleep(5000);
    }
}
