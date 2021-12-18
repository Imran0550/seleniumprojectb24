package com.cybertek.tests.day20_review_wait;

import com.cybertek.pages.AllOrdersPage;
import com.cybertek.pages.SmartBearDashboardPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SmartBearLinkTest extends TestBase {

    @Test
    public void smartBearTest(){
        driver.get(ConfigurationReader.getProperty("smart"));
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        new AllOrdersPage().checkBox("Paul Brown");
    }
}
