package com.cybertek.tests.day22_explicitwait_review;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitUntilElemVisibleTest extends TestBase {

    @Test
    public void waitForWebDriverElem() {
           driver.get(ConfigurationReader.getProperty("seleniumpractice.url"));

        WebElement startTimer = driver.findElement(By.xpath("//button[@onclick = 'timedText()']"));
        startTimer.click();

        //Wait until WebDriver is visible
        WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='WebDriver']")));
        //System.out.println("WEBDRIVER is now available");

        wait.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));
        System.out.println("WEBDRIVER is now available");
    }

    @Test
    public void cheapInternetSpeedTest(){
        driver.get(ConfigurationReader.getProperty("speedtest.url"));
        WebDriverWait wait = new WebDriverWait(driver,60);
        //wait until finding change server is appeared


        //click on Go button
        WebElement go = driver.findElement(By.className("start-text"));
        go.click();

        //wait until element with class gauge-speed-text disappears
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("gauge-speed-text")));

        WebElement speedElement = driver.findElement(By.className("gauge-speed-text"));
        wait.until(ExpectedConditions.visibilityOf(speedElement));

        wait.until(ExpectedConditions.invisibilityOf(speedElement));


        WebElement downloadMbps = driver.findElement(By.cssSelector("result-data-large number result-data-value download-speed"));
        System.out.println("downloadMbps.getText() = " + downloadMbps.getText());





    }

}
