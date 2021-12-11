package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsySubscribeTest extends TestBase {

    Faker faker = new Faker();

    @Test
    public void SubscribeTest(){
        driver.get(ConfigurationReader.getProperty("Etsy"));

        WebElement subscribe = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)", subscribe);

        WebElement email = driver.findElement(By.cssSelector("#email-list-signup-email-input"));
        email.sendKeys(faker.internet().emailAddress());

        subscribe.click();

        WebElement res = driver.findElement(By.xpath("//div[@class= 'wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));

        Assert.assertEquals(res.getText(),"Great! We've sent you an email to confirm your subscription.");

    }
}
