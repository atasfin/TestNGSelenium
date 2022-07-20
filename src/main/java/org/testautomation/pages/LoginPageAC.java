package org.testautomation.pages;

import helperfunctions.ClickFunctions;
import org.openqa.selenium.By;
import org.testautomation.drivers.DriverManager;
import org.testautomation.utils.ReadPropertyFiles;

public class LoginPageAC {

    private final By ACLoginUserName = By.id("txtUserName");
    private final By ACLoginPassword = By.id("txtPassword");
    private final By ACRememberMeCheckBox = By.cssSelector(".inputCheckBox");
    private final By ACLoginButton = By.cssSelector("[type='submit']");

    public void enterUserName() throws Exception {
        DriverManager.getSharedDriver().findElement(ACLoginUserName)
                .sendKeys(ReadPropertyFiles.getPropertyValueFromMap("accounting_center_user_name"));
    }

    public void enterPassword() throws Exception {
        DriverManager.getSharedDriver().findElement(ACLoginPassword)
                .sendKeys(ReadPropertyFiles.getPropertyValueFromMap("accounting_center_password"));
    }

    public void clickACRememberMeCheckBox() {
        ClickFunctions.click(ACRememberMeCheckBox);
    }

    public void clickACLoginButton() {
        ClickFunctions.click(ACLoginButton);
    }
}
