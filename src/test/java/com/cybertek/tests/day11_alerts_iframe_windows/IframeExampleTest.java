package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IframeExampleTest {

    String url = "http://practice.cybertekschool.com/iframe";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void IFrameTest(){
        //switch to the frame by id "mce_0_ifr"
        driver.switchTo().frame("mce_0_ifr");
        //now we are almost on the frame


        WebElement commentField = driver.findElement(By.id("tinymce"));
        System.out.println("commentField.getText() = " + commentField.getText());
        commentField.clear();
        commentField.sendKeys("Hello Hello");

        //go out from iframe back to main content

        driver.switchTo().defaultContent();
    }

    @Test
    public void multipleFramesTest(){

     String url2 = "http://practice.cybertekschool.com/nested_frames";
     driver.get(url2);
     //find out the count of frames in this page
        List<WebElement> frame = driver.findElements(By.tagName("frame"));
        System.out.println("frames = " + frame.size());


        //Switch to bottom frame by name
        driver.switchTo().frame("frame-bottom");
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        System.out.println("bodyElement.getText() = " + bodyElement.getText());

        //go out from the bottom iframe to main level
        driver.switchTo().defaultContent();

        //switch to first frame(0)
        driver.switchTo().frame(0).switchTo().frame(0);
        bodyElement = driver.findElement(By.tagName("body"));
        System.out.println("bodyElement.getText() = " + bodyElement.getText());

        //go back parent frame and back to default content
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        driver.switchTo().frame(0).switchTo().frame(driver.findElement(By.xpath("//frame[@src = '/frame_right']")));
         bodyElement = driver.findElement(By.tagName("body"));
        System.out.println("bodyElement.getText() = " + bodyElement.getText());


    }
}
