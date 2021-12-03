package com.cybertek.tests.day12_window_practice;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DemoQAMultipleWindowsTest {

    WebDriver driver;
    String url = "https://demoqa.com/browser-windows";

    @BeforeMethod
    public void setDriver(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    /*
       Click on new window
       Switch to the
        */
    @Test
    public void TestWindow() throws InterruptedException{
        WebElement newWindow = driver.findElement(By.cssSelector("#windowButton"));
        newWindow.click();
        Thread.sleep(2000);

        //driver.close();

       Set<String> windowHandles = driver.getWindowHandles();
       String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Current handle: " + parentWindowHandle);


        for (String each : windowHandles){
            driver.switchTo().window(each);

        }
         parentWindowHandle = driver.getWindowHandle();
        System.out.println("After switching window handle is: " + parentWindowHandle);

        WebElement header = driver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println(header.getText());
        Thread.sleep(2000);

        driver.close();


    }
}
