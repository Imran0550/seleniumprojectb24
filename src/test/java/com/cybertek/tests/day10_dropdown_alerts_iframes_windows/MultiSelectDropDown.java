package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultiSelectDropDown {

    String url = "http://practice.cybertekschool.com/dropdown";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void SelectFromDropDown() throws InterruptedException {

        WebElement select = driver.findElement(By.name("Languages"));

        Select drop = new Select(select);

        drop.selectByVisibleText("Java");
        drop.selectByVisibleText("JavaScript");
        drop.selectByVisibleText("Python");

        System.out.println("Language.isMultiple() = " + drop.isMultiple());



        // uncheck all selected options
Thread.sleep(2000);
        drop.deselectAll();

        Thread.sleep(1234);

        for(WebElement each : drop.getOptions()){
            each.click();
        }
    }

}
