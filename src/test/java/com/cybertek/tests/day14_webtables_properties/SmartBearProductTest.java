package com.cybertek.tests.day14_webtables_properties;

import com.cybertek.utils.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearProductTest extends SmartBearTestBase {

    @Test(priority = 1)
    public void verifyLinksAfterLogin(){
        //perform login steps
        SmartBearUtils.loginToSmartBear(driver);

        // get all the links and print count and text

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for(WebElement each : links){
            System.out.println(each.getText());

        }
    }
    @Test(priority = 2)
    public void verifyLinks(){
        SmartBearUtils.loginToSmartBear(driver);
        SmartBearUtils.addProduct(driver);
    }
}
