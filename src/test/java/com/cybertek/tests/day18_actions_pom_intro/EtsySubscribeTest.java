package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsySubscribeTest extends TestBase {



    @Test
    public void SubscribeTest(){
        driver.get(ConfigurationReader.getProperty("Etsy"));

        WebElement subscribe = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

        BrowserUtil.scrollDownElement(subscribe);

        WebElement email = driver.findElement(By.cssSelector("#email-list-signup-email-input"));
        email.sendKeys(faker.job().seniority());

        subscribe.click();

        WebElement res = driver.findElement(By.xpath("//div[@class= 'wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));

        Assert.assertEquals(res.getText(),"Great! We've sent you an email to confirm your subscription.","Subscription unsuccessfully ");

    }
}
