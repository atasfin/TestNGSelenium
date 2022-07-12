package org.testautomation.utils;

import org.testautomation.constants.ProjectConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFiles {

    private ReadPropertyFiles() {

    }

    private static Properties property = new Properties();
    private static final Map<String, String> configMap = new HashMap<>();

    static {
        try {
            FileInputStream file = new FileInputStream(ProjectConstants.getConfigPropertyFilePath());
            property.load(file);
//            for(Object key : property.keySet()){
//                configMap.put(String.valueOf(key), String.valueOf(property.get(key)));
//            }
            for(Map.Entry<Object, Object> entry: property.entrySet()){
                configMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyValueFromMap(String key) throws Exception {
        if(Objects.isNull(key) || Objects.isNull(configMap.get(key))){
            throw new Exception("Property value" + key + "has not found, please check config.properties file");
        }
        return configMap.get(key);
    }

//    public static String getPropertyValues(String key) throws Exception {
//        if (Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {
//            throw new Exception("Property value" + key + "has not found, please check config.properties file");
//        }
//        return property.getProperty(key);
//    }

}
