package org.testautomation.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import helperfunctions.ClickFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testautomation.drivers.DriverManager;

import java.util.concurrent.TimeUnit;

public class HomePageGTZShip {


    WebElement buttonContainerLink = DriverManager.getSharedDriver().findElement(By.id("buttonContainerColumn"));

    private final By logOutLink = By.cssSelector("[data-bind='click: SignOut']");

    public void signOutFromGTZShipHomePage() throws Exception {
        Actions action = new Actions(DriverManager.getSharedDriver());
        WebDriverWait wait = new WebDriverWait(DriverManager.getSharedDriver(), 10);
        action.moveToElement(buttonContainerLink).perform();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(logOutLink));
        ClickFunctions.click(logOutLink);
    }




}
