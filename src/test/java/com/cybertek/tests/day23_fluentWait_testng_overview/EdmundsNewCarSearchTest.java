package com.cybertek.tests.day23_fluentWait_testng_overview;

import com.cybertek.pages.EdmundsCarDetailsPage;
import com.cybertek.pages.EdmundsHomePage;
import com.cybertek.pages.EdmundsNewCarPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class EdmundsNewCarSearchTest extends TestBase {

    @Test
    public void searchForNewCarTest(){
        driver.get(ConfigurationReader.getProperty("edmunds.url"));

        EdmundsHomePage homePage = new EdmundsHomePage();
        homePage.isCurrentPage();
        homePage.goToNewCarPricingPage();

        EdmundsNewCarPage carPage = new EdmundsNewCarPage();
        carPage.isCurrentPage();
        carPage.selectMake("Toyota");
        carPage.selectModel("Highlander");
        BrowserUtil.sleep(1);
        carPage.zipCode.clear();
        BrowserUtil.sleep(1);
        carPage.zipCode.sendKeys("22401");
        carPage.go.click();

        EdmundsCarDetailsPage carDetailsPage = new EdmundsCarDetailsPage();
        carDetailsPage.isCurrentPage();
        System.out.println(carDetailsPage.result());



    }
}
