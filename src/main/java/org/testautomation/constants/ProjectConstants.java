package org.testautomation.constants;

public final class ProjectConstants {

    private ProjectConstants(){

    }

    private static final String  CHROMEDRIVERPATH = "src/test/resources/executables/chromedriver.exe";
    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }
}
