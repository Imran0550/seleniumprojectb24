package com.cybertek.tests.MyPractice;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitPractice extends TestBase {

//    @Test(priority = 1)
//    public void ExplicitWaitTest(){
//        driver.get(ConfigurationReader.getProperty("selenium"));
//
//        WebElement buttonToClick = driver.findElement(By.cssSelector("#enable-button"));
//        buttonToClick.click();
//
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#disable"))));
//
//        System.out.println("BUTTON IS NOW VISIBLE!");
//    }

    @Test(priority = 1)
    public void ExplicitWaitTest2(){
        driver.get(ConfigurationReader.getProperty("selenium"));

        WebElement checkBox = driver.findElement(By.cssSelector("#checkbox"));
        checkBox.click();

        WebElement check = driver.findElement(By.cssSelector("#ch"));

        WebDriverWait wait = new WebDriverWait(driver,11);
        wait.until(ExpectedConditions.elementToBeSelected(check));
        System.out.println("Button is now checked");


    }

    @Test(priority = 2)
    public void ExplicitWait2Test(){

        WebElement element = driver.findElement(By.cssSelector("#populate-text"));
        element.click();

        WebDriverWait wait = new WebDriverWait(driver,11);
        wait.until(ExpectedConditions.textToBe(By.id("h2"),"Selenium Webdriver"));

        System.out.println("Web Driver is now visible");

    }
}
