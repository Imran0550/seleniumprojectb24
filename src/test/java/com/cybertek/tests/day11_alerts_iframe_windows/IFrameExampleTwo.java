package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFrameExampleTwo {

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
    public void TestCase01(){
        //switch to frame to access the element location
        driver.switchTo().frame(0);
        //locate the element
        WebElement textArea = driver.findElement(By.xpath("//body[@id = 'tinymce']"));
        //click on it
        textArea.clear();
        //send hello hello
        textArea.sendKeys("Hellow Hellow");

        //switch back to default so you can use it later
        driver.switchTo().defaultContent();
    }
}
