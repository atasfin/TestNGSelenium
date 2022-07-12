package org.testautomation.constants;

public final class ProjectConstants {

    private ProjectConstants(){

    }

    private static final String  RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources/";
    private static final String  CHROMEDRIVERPATH = RESOURCEPATH + "executables/chromedriver.exe";
    private static final String CONFIGPROPERTYPATH = RESOURCEPATH + "/config/config.properties";
    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }
    public static String getConfigPropertyFilePath() {
        return CONFIGPROPERTYPATH;
    }
}
