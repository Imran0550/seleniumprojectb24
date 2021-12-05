package com.cybertek.tests.day15_properties_driverutil_testbase;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileTest {

    @Test
    public void readValuesFromPropertiesFile() throws Exception {
        // Properties class - comes from java library
        Properties prompts = new Properties();

        // open file using FileInputStream
        FileInputStream fileInputStream = new FileInputStream("configuration.properties");

        //load file content into properties object
        prompts.load(fileInputStream);

        System.out.println(prompts.getProperty("browser"));
        System.out.println(prompts.getProperty("webTableUrl"));
        System.out.println(prompts.getProperty("env"));
    }
}
