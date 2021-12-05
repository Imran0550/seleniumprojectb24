package com.cybertek.tests.day14_webtables_properties;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SmartBearTestBase {
WebDriver driver;
String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage()
                .timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){

    }
}
