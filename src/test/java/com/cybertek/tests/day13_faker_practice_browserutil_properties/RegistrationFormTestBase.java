package com.cybertek.tests.day13_faker_practice_browserutil_properties;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * parent class for RegistrationFormTest
 * Created By: Imran
 */
public class RegistrationFormTestBase {

    WebDriver driver;
    String url = "http://practice.cybertekschool.com/registration_form";


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
      //  driver.quit();
    }
}
