package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
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

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

    }

}
