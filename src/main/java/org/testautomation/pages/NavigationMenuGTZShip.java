package org.testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testautomation.drivers.DriverManager;
import org.testautomation.projectenums.SelectorType;
import org.testautomation.projectenums.WaitStrategy;

public class NavigationMenuGTZShip extends BasePage {

    private final By menuBtn_Rate = By.cssSelector("[id='Rates']");
    private final By subMenu_New_LTL = By.cssSelector("[id='subMenuList'] .LTLDropDownImage");
    private final By subMenu_New_TL = By.cssSelector("[id='subMenuList'] .LTLDropDownImage");
    private final By subMenu_New_Expedited = By.cssSelector("[id='subMenuList'] .EXPDropDownImage");
    private final By subMenu_LTL_SaveQuotes = By.cssSelector("[id='subMenuList'] .LTLSavedQuotes");
    private final By subMenu_LTL_Favorite = By.cssSelector("[id='subMenuList'] .LTLFavoriteShipment");

    private final By logOutLink = By.cssSelector("[data-bind='click: SignOut']");


    String rate_menu_selector = "[id='Rates']";
    String sign_out_menu_selector = "buttonContainerColumn";


    public NavigationMenuGTZShip hoveOverRatingMenuGTZShip() throws Exception {
        hoverOverItem(rate_menu_selector, menuBtn_Rate, WaitStrategy.CLICKABLE);
        return this;
    }

    public NavigationMenuGTZShip navigateToLTLShipPage() throws Exception {
        buttonClick(subMenu_New_LTL, WaitStrategy.CLICKABLE);
        return this;
    }

    public NavigationMenuGTZShip hoveOverLogOutMenu() throws Exception {
        hoverOverItem(sign_out_menu_selector, logOutLink, WaitStrategy.CLICKABLE, SelectorType.ID);
        return this;
    }

    public NavigationMenuGTZShip SignOutFromLTLShipPage() throws Exception {
        buttonClick(logOutLink, WaitStrategy.CLICKABLE);
        return this;
    }
}
