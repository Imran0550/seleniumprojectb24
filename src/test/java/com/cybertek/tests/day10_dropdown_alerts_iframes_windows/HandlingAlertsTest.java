package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HandlingAlertsTest {

    String url = "http://practice.cybertekschool.com/javascript_alerts";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test(priority = 1)
    public void jsAlertTest() throws InterruptedException{

        //click on informational/warning alert link

        WebElement inputAlertLink = driver.findElement(By.xpath("//*[.='Click for JS Alert']"));
        inputAlertLink.click();

        Alert infoAlert = driver.switchTo().alert();
        System.out.println("Alert Text : " + infoAlert.getText());
        Thread.sleep(4000);
        infoAlert.accept();

        Thread.sleep(4000);





    }
    @Test
    public void ConfirmJSTest() throws InterruptedException {
        WebElement infoAlertOk = driver.findElement(By.xpath("//div//button[.='Click for JS Confirm']"));
        infoAlertOk.click();
       Thread.sleep(2000);
        Alert infoAlert2 = driver.switchTo().alert();
        System.out.println("Alert Text : " + infoAlert2.getText());
        Assert.assertEquals(infoAlert2.getText(),"I am a JS Confirm");
        infoAlert2.dismiss();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
