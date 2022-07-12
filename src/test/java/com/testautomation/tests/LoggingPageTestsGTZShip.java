package com.testautomation.tests;

import org.testautomation.drivers.DriverManager;
import org.testautomation.pages.LoginPageGTZShip;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;


public class LoggingPageTestsGTZShip extends BaseTest {

    LoginPageGTZShip loginPageGTZShip = new LoginPageGTZShip();

    @Test
    public void loggingTest() throws Exception {
        loginPageGTZShip.enterUserName().enterPassword().clickGTZShipLoginButton();
        String pageTitle = DriverManager.getSharedDriver().getTitle();
        Assert.assertTrue(Objects.nonNull(pageTitle));
        Assert.assertTrue(pageTitle.contains("GTZship"));
        Thread.sleep(5000);
    }
}
