package com.cybertek.tests.day20_review_wait;

import com.cybertek.pages.DoubleClickPOM;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeReviewTest extends TestBase {

    @Test
    public void IframeReview(){
        driver.get(ConfigurationReader.getProperty("doubleclick.url"));

        DoubleClickPOM clickPOM = new DoubleClickPOM();

        clickPOM.switchToIframe(clickPOM.iframe);



        System.out.println(clickPOM.text.getAttribute("style"));
        Assert.assertTrue(clickPOM.text.getAttribute("style").contains("red"));

        driver.switchTo().defaultContent();


    }


}
