package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class actionsDemoTest extends TestBase {

    @Test
    public void actionsTest(){

        driver.get(ConfigurationReader.getProperty("hover.url"));

       WebElement image1 = driver.findElement(By.xpath("(//img)[1]"));

        //hover over first image
        actions.moveToElement(image1).perform();

        BrowserUtil.sleep(1);

        WebElement image2 = driver.findElement(By.xpath("(//img)[2]"));

        actions.moveToElement(image2).perform();

        BrowserUtil.sleep(1);

        WebElement image3 = driver.findElement(By.xpath("(//img)[3]"));

        actions.moveToElement(image3).perform();



        // repeat above method using loop


    }

    @Test
            public void hoverOverGroupOfElements(){
    List<WebElement> images = driver.findElements(By.tagName("img"));

        for(WebElement each : images) {
            actions.moveToElement(each).perform();
            BrowserUtil.sleep(2);

        }
    }

    @Test
    public void feelingLuckyButtonHoverTest(){



        driver.get(ConfigurationReader.getProperty("google.url"));
        //locate 2 buttons

        WebElement searchButton = driver.findElement(By.xpath("//div[@class ='FPdoLc lJ9FBc']//input[@class = 'gNO89b']"));

        //locate and put into the list
       WebElement lucky = driver.findElement(By.cssSelector("#gbqfbb"));

       for(int i=0;i<=5;i++) {

           actions.moveToElement(lucky).perform();
           BrowserUtil.sleep(2);
           actions.moveToElement(searchButton).perform();
           BrowserUtil.sleep(1);

       }

    }

}
