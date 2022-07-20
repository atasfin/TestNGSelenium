package org.testautomation.pages;

import helperfunctions.ClickFunctions;
import org.openqa.selenium.By;
import org.testautomation.drivers.DriverManager;
import org.testautomation.utils.ReadPropertyFiles;

public class LoginPageGTZShip {

    private final By GTZShipLoginUserName = By.cssSelector("[id='txtUserName']");
    private final By GTZShipLoginPassword = By.cssSelector("[id='txtPassword']");
    private final By GTZShipLoginButton = By.cssSelector(".new_login_btn");

    public LoginPageGTZShip enterUserName() throws Exception {
        DriverManager.getSharedDriver().findElement(GTZShipLoginUserName)
                .sendKeys(ReadPropertyFiles.getPropertyValueFromMap("gtzship_user_name"));
        return this;
    }

    public LoginPageGTZShip enterPassword() throws Exception {
        DriverManager.getSharedDriver().findElement(GTZShipLoginPassword)
                .sendKeys(ReadPropertyFiles.getPropertyValueFromMap("gtzship_password"));
        return this;
    }

    public LoginPageGTZShip clickGTZShipLoginButton() {
        ClickFunctions.click(GTZShipLoginButton);
        return this;
    }
}
