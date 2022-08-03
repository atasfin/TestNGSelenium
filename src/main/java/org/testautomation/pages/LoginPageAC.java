package org.testautomation.pages;

import org.testautomation.helperfunctions.ClickFunctions;
import org.openqa.selenium.By;
import org.testautomation.drivers.DriverManager;
import org.testautomation.projectenums.PropertiesEnum;
import org.testautomation.utils.ReadPropertyFiles;

public class LoginPageAC {

    private final By ACLoginUserName = By.id("txtUserName");
    private final By ACLoginPassword = By.id("txtPassword");
    private final By ACRememberMeCheckBox = By.cssSelector(".inputCheckBox");
    private final By ACLoginButton = By.cssSelector("[type='submit']");

    public void enterUserName() throws Exception {
        DriverManager.getSharedDriver().findElement(ACLoginUserName)
                .sendKeys(ReadPropertyFiles.getPropertyValueFromMap(PropertiesEnum.ACCOUNTING_CENTER_USER_NAME));
    }

    public void enterPassword() throws Exception {
        DriverManager.getSharedDriver().findElement(ACLoginPassword)
                .sendKeys(ReadPropertyFiles.getPropertyValueFromMap(PropertiesEnum.ACCOUNTING_CENTER_PASSWORD));
    }

    public void clickACRememberMeCheckBox() {
        ClickFunctions.click(ACRememberMeCheckBox);
    }

    public void clickACLoginButton() {
        ClickFunctions.click(ACLoginButton);
    }
}
