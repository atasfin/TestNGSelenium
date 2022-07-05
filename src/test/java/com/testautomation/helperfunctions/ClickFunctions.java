package com.testautomation.helperfunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.SeleniumDriver;

public class ClickFunctions {

    //static WebDriver newDriver = SeleniumDriver.getDriver();
    //static WebDriver newSharedDriver = SeleniumDriver.getSharedDriver();

    //JavascriptExecutor jsDriver = (JavascriptExecutor) newDriver;
    //JavascriptExecutor jsSharedDriver = (JavascriptExecutor) newSharedDriver;

//    public void javaScriptClick(String cssSelector) {
//        String script = "$('" + cssSelector + "').click();";
//        jsDriver.executeScript(script);
//    }

    public void javaScriptSharedDrClick(String cssSelector, WebDriver driver) {
        JavascriptExecutor jsSharedDriver = (JavascriptExecutor) driver;
        String script = "$('" + cssSelector + "').click();";
        jsSharedDriver.executeScript(script);
    }

}
