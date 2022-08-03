package org.testautomation.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testautomation.drivers.DriverManager;
import org.testautomation.projectenums.WaitStrategy;

public class ExplicitWaitFactory {

    public static void performExplicitWait(By by, WaitStrategy waitStrategy){
        if (waitStrategy.equals(WaitStrategy.CLICKABLE)) {
            new WebDriverWait(DriverManager.getSharedDriver(), 10)
                    .until(ExpectedConditions.elementToBeClickable(by));
        } else if (waitStrategy.equals(WaitStrategy.PRESENCE)) {
            new WebDriverWait(DriverManager.getSharedDriver(), 10)
                    .until(ExpectedConditions.presenceOfElementLocated(by));
        } else if (waitStrategy.equals(WaitStrategy.VISIBLE)) {
            new WebDriverWait(DriverManager.getSharedDriver(), 10)
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        } else if (waitStrategy.equals(WaitStrategy.NONE)) {
            new WebDriverWait(DriverManager.getSharedDriver(), 10)
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }
    }
}
