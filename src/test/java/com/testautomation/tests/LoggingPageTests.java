package com.testautomation.tests;

import org.openqa.selenium.By;
import org.testautomation.drivers.SeleniumDriver;
import org.testng.annotations.Test;


public class LoggingPageTests extends BaseTest {

    @Test
    public void loggingTest() throws InterruptedException {
//        Driver.getDriver().findElement(By.cssSelector("[id='txtUserName']")).sendKeys("Siglers");
//        Driver.getDriver().findElement(By.cssSelector("[id='txtPassword']")).sendKeys("Agent%9999");
//        Driver.getDriver().findElement(By.cssSelector(".new_login_btn")).click();
        SeleniumDriver.getSharedDriver().findElement(By.cssSelector("[id='txtUserName']")).sendKeys("Siglers");
        SeleniumDriver.getSharedDriver().findElement(By.cssSelector("[id='txtPassword']")).sendKeys("Agent%9999");
        SeleniumDriver.getSharedDriver().findElement(By.cssSelector(".new_login_btn")).click();
        Thread.sleep(5000);
    }
}
