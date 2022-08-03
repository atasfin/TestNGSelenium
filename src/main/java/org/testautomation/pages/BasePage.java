package org.testautomation.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testautomation.drivers.DriverManager;
import org.testautomation.factories.ExplicitWaitFactory;
import org.testautomation.projectenums.SelectorType;
import org.testautomation.projectenums.WaitStrategy;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public void buttonClick(By selector) {
        DriverManager.getSharedDriver().findElement(selector).click();
    }

    public void sendText(By selector, String text) {
        DriverManager.getSharedDriver().findElement(selector).sendKeys(text);
    }

    public void buttonClick(By selector, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.performExplicitWait(selector, waitStrategy);
        DriverManager.getSharedDriver().findElement(selector).click();
    }

    public void sendText(By selector, String text, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.performExplicitWait(selector, waitStrategy);
        DriverManager.getSharedDriver().findElement(selector).sendKeys(text);
    }

    public void hoverOverItem(String selector, By element, WaitStrategy waitStrategy) {
        WebElement locator = DriverManager.getSharedDriver().findElement(By.cssSelector(selector));
        Actions action = new Actions(DriverManager.getSharedDriver());
        WebDriverWait wait = new WebDriverWait(DriverManager.getSharedDriver(), 10);
        action.moveToElement(locator).perform();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        explicitlyWaitForElementToBeClickable(element);
    }

    public void hoverOverItem(String selector, By element, WaitStrategy waitStrategy, SelectorType selectorType) {
        WebElement locator = getWebElement(selector, selectorType);
        Actions action = new Actions(DriverManager.getSharedDriver());
        WebDriverWait wait = new WebDriverWait(DriverManager.getSharedDriver(), 10);
        action.moveToElement(locator).perform();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        explicitlyWaitForElementToBeClickable(element);
    }

    public WebElement getWebElement(String selector, SelectorType selectorType){
        WebElement selectedLocatorType = null;
        if (selectorType.equals(SelectorType.CSSSELECTOR)) {
            selectedLocatorType = DriverManager.getSharedDriver().findElement(By.cssSelector(selector));
        }else if (selectorType.equals(SelectorType.ID)) {
            selectedLocatorType = DriverManager.getSharedDriver().findElement(By.id(selector));
        }else if (selectorType.equals(SelectorType.XPATH)) {
            selectedLocatorType = DriverManager.getSharedDriver().findElement(By.xpath(selector));
        }
        return selectedLocatorType;
    }

    public void explicitlyWaitForElementToBeClickable(By by) {
        new WebDriverWait(DriverManager.getSharedDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public void explicitlyWaitForElementToBePresent(By by) {
        new WebDriverWait(DriverManager.getSharedDriver(), 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void explicitlyWaitForElementToHover(By by) {
        new WebDriverWait(DriverManager.getSharedDriver(), 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
