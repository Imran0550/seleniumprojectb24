package com.cybertek.tests;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utils.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
   protected  WebDriver driver;
   protected Faker faker = new Faker();
   protected Actions actions = new Actions(Driver.getDriver());
   protected LibraryLoginPage libraryLoginPage;
    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        libraryLoginPage = new LibraryLoginPage();


    }


    @AfterMethod
    public void tearDown(){
      //  Driver.closeDriver();
    }
}
