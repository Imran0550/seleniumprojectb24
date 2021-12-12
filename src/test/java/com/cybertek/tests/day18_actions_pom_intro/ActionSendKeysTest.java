package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionSendKeysTest extends TestBase {

    @Test
    public void SendKeysTest(){

        driver.get(ConfigurationReader.getProperty("practice.base.url"));

        WebElement sbSchoolLink = driver.findElement(By.linkText("Cybertek School"));

       actions.moveToElement(sbSchoolLink).perform();

       BrowserUtil.sleep(2);

       for (int i=0;i<=2;i++) {

           actions.sendKeys(Keys.PAGE_UP).perform();
           BrowserUtil.sleep(2);
       }
        BrowserUtil.sleep(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Test
    public void rightClickTest(){
        driver.get(ConfigurationReader.getProperty("practice.base.url"));

        WebElement test = driver.findElement(By.linkText("A/B Testing"));

        actions.contextClick(test).perform();

        BrowserUtil.sleep(2);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        BrowserUtil.sleep(1);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        BrowserUtil.sleep(1);
        actions.sendKeys(Keys.ENTER).perform();


    }

}
