package org.testautomation.pages;

import org.testautomation.helperfunctions.ClickFunctions;
import org.testautomation.helperfunctions.PopulateValues;
import org.openqa.selenium.By;

public class LoginPageGTZShip extends BasePage {

    private final By GTZShipLoginUserName = By.cssSelector("[id='txtUserName']");
    private final By GTZShipLoginPassword = By.cssSelector("[id='txtPassword']");
    private final By GTZShipLoginButton = By.cssSelector(".new_login_btn");

    public LoginPageGTZShip enterUserName() throws Exception {
        PopulateValues.sendKeyText(GTZShipLoginUserName, "gtzship_user_name");
        return this;
    }

    public LoginPageGTZShip enterPassword() throws Exception {
        PopulateValues.sendKeyText(GTZShipLoginPassword, "gtzship_password");
        return this;
    }

    public LoginPageGTZShip clickGTZShipLoginButton() {
        ClickFunctions.click(GTZShipLoginButton);
        return this;
    }
}
