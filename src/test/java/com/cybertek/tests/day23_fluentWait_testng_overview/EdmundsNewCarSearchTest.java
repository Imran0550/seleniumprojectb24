package com.cybertek.tests.day23_fluentWait_testng_overview;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class EdmundsNewCarSearchTest extends TestBase {

    @Test
    public void searchForNewCarTest(){
        driver.get(ConfigurationReader.getProperty("edmunds.url"));

    }
}
