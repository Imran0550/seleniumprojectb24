package com.cybertek.tests;

import com.cybertek.utils.Driver;
import com.github.javafaker.Faker;
import com.sun.deploy.association.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
   protected  WebDriver driver;
   protected Faker faker = new Faker();
   protected Actions actions = new Actions(Driver.getDriver());
    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();

    }


    @AfterMethod
    public void tearDown(){
        //Driver.closeDriver();
    }
}
