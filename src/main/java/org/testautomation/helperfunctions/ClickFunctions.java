package org.testautomation.helperfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testautomation.drivers.DriverManager;

public class ClickFunctions {

    public static void javaScriptClick(String cssSelector, WebDriver driver) {
        JavascriptExecutor jsSharedDriver = (JavascriptExecutor) driver;
        String script = "$('" + cssSelector + "').click();";
        jsSharedDriver.executeScript(script);
    }

    public static void click(By locator){
        DriverManager.getSharedDriver().findElement(locator).click();
    }

    public static void submit(By locator){
        DriverManager.getSharedDriver().findElement(locator).submit();
    }

}
