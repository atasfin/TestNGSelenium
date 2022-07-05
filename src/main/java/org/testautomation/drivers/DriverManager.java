package org.testautomation.drivers;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager() {

    }

    public static ThreadLocal<WebDriver> sharedDriver = new ThreadLocal<>();


    public static WebDriver getSharedDriver() {
        return sharedDriver.get();
    }

    public static void setSharedDriver(WebDriver driverRef) {
        sharedDriver.set(driverRef);
    }

    public static void cleanSharedDriver() {
        sharedDriver.remove();
    }

}
