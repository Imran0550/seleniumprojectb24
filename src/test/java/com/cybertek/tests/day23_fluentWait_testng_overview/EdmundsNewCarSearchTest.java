package com.cybertek.tests.day23_fluentWait_testng_overview;

import com.cybertek.pages.EdmundsHomePage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class EdmundsNewCarSearchTest extends TestBase {

    @Test
    public void searchForNewCarTest(){
        driver.get(ConfigurationReader.getProperty("edmunds.url"));

        EdmundsHomePage homePage = new EdmundsHomePage();
        homePage.isCurrentPage();
        homePage.goToNewCarPricingPage();


    }
}
