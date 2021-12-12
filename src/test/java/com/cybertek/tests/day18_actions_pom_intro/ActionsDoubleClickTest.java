package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ActionsDoubleClickTest extends TestBase {

    @Test
    public void doubleClickForColorChange(){
        driver.get(ConfigurationReader.getProperty("doubleclick.url"));

        //locate the iframe
        WebElement iframe = driver.findElement(By.id("iframeResult"));
        //switch to the iframe
        driver.switchTo().frame(iframe);
        WebElement demo = driver.findElement(By.xpath("//p[@id = 'demo']"));
        System.out.println("demo text = " + demo.getText());

        // now double click on the element to change its color
        actions.doubleClick(demo).perform();

        System.out.println("style of text" + demo.getAttribute("style"));

        assertTrue(demo.getAttribute("style").contains("red"));
        // switch back to default driver
        driver.switchTo().defaultContent();


    }
}
