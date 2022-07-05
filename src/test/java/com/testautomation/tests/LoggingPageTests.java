package com.testautomation.tests;

import org.openqa.selenium.By;
import org.testautomation.drivers.DriverManager;
import org.testautomation.drivers.SeleniumDriver;
import org.testng.annotations.Test;


public class LoggingPageTests extends BaseTest {

    @Test
    public void loggingTest() throws InterruptedException {
//        Driver.getDriver().findElement(By.cssSelector("[id='txtUserName']")).sendKeys("Siglers");
//        Driver.getDriver().findElement(By.cssSelector("[id='txtPassword']")).sendKeys("Agent%9999");
//        Driver.getDriver().findElement(By.cssSelector(".new_login_btn")).click();
        DriverManager.getSharedDriver().findElement(By.cssSelector("[id='txtUserName']")).sendKeys("Siglers");
        DriverManager.getSharedDriver().findElement(By.cssSelector("[id='txtPassword']")).sendKeys("Agent%9999");
        DriverManager.getSharedDriver().findElement(By.cssSelector(".new_login_btn")).click();
        Thread.sleep(5000);
    }
}
