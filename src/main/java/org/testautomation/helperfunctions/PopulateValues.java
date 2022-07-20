package org.testautomation.helperfunctions;

import org.openqa.selenium.By;
import org.testautomation.drivers.DriverManager;
import org.testautomation.utils.ReadPropertyFiles;

public class PopulateValues {

    public static void sendKeyText(By locator, String mapPropertyName) throws Exception {
        DriverManager.getSharedDriver().findElement(locator)
                .sendKeys(ReadPropertyFiles.getPropertyValueFromMap(mapPropertyName));
    }

}
