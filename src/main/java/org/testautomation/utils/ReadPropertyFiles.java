package org.testautomation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFiles {

    private ReadPropertyFiles() {

    }

    private static Properties property = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
            property.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyValues(String Key) throws Exception {
        String value = "";
        Properties properties = new Properties();

        value = properties.getProperty(Key);
        if (Objects.isNull(value)) {
            throw new Exception("Property value" + Key + "has not found, please check config.properties file");
        }
        return value;
    }

}
