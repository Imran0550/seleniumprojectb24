package com.cybertek.utils;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * this util class is used to read values from configuration.properties file
 */

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
      try { //open the file using inputstream
            FileInputStream inputStream = new FileInputStream("configuration.properties");

            // load to peoperties object
            properties.load(inputStream);

            // closed the file after loading}
        }catch (Exception e){
          e.getStackTrace();
          System.out.println("Exception happened here");
      }
    }

    /**
     * Methos is used to read value from the configuration.properties file
     * @param key -> key name in properties file
     * @return -> value for the key
     */

    public static String getProperty(String key){
       return properties.getProperty(key);
    }

}
