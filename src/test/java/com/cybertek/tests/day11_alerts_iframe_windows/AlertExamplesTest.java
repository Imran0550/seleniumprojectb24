package com.cybertek.tests.day11_alerts_iframe_windows;


import com.cybertek.utils.WebDriverFactory;
import javafx.scene.layout.Priority;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AlertExamplesTest {


    String url = "http://practice.cybertekschool.com/javascript_alerts";
    WebDriver driver;


    @BeforeMethod
    public void setDriver(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

    }
    @Test(priority = 1)
    public void Test01() throws InterruptedException{

        //click on JS Alert link
        WebElement alert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        alert.click();

        Thread.sleep(2000);

        Alert infoAlert = driver.switchTo().alert();

        System.out.println("infoAlert.getText() = " + infoAlert.getText());
        assertEquals(infoAlert.getText(),"I am a JS Alert");
        infoAlert.accept();

        // assert the confirmation
        WebElement result = driver.findElement(By.id("result"));

        assertEquals(result.getText(),"You successfuly clicked an alert");
         // just for fun man:))))))))))
//        Random random = new Random();
//        int u = random.nextInt(9) + 1;
//        System.out.println(u);

    }

    @Test(priority = 2)
    public void ConfirmAlertTest(){

       // locate JS Confirm
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']"));
        //click on it
        alert1.click();

        // switch to Alert

        Alert alert = driver.switchTo().alert();

        //confirm the text
        assertEquals(alert.getText(),"I am a JS Confirm");
        // click on cancel
        alert.dismiss();

        // get the result text

        WebElement result2 = driver.findElement(By.id("result"));

        // print result2 text

        System.out.println("result2.getText() = " + result2.getText());

        // confirm the result
        assertEquals(result2.getText(),"You clicked: Cancel");

    }

    @Test(priority = 3)
    public void promptAlertTest() throws InterruptedException{

        //locate the alert
        WebElement promptAlert = driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]"));
        //click on alert
        promptAlert.click();
        //switch to alert
        Alert promptAlt = driver.switchTo().alert();
        //get alert text
        System.out.println("promptAlt.getText() = " + promptAlt.getText());
        // verify the text
         assertEquals(promptAlt.getText(),"I am a JS prompt");
         // send text
        Thread.sleep(2000);
        promptAlt.sendKeys("Hello Universe");
        // accept the alert
        promptAlt.accept();

        // get the result
        WebElement finalResult = driver.findElement(By.id("result"));
        // verify the result is correct
        assertEquals(finalResult.getText(),"You entered: Hello Universe");
    }

    @AfterMethod
    public void tearDown(){
       driver.quit();
    }
}
