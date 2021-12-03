package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowsExampleTest2 {

    String url = "http://practice.cybertekschool.com/windows";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void testCase02(){
        //get the unique iq from window
        String mainWindow = driver.getWindowHandle();
        System.out.println("mainWindow = " + mainWindow);
        
        
        //locate the new window and click on it
        WebElement newWindow = driver.findElement(By.linkText("Click Here"));
        newWindow.click();

        Set<String> bothWindows = driver.getWindowHandles();
        
        for(String each : bothWindows){
            driver.switchTo().window(each);
            System.out.println("each = " + each);
        }

        mainWindow = driver.getWindowHandle();
        System.out.println("mainWindow = " + mainWindow);
    }
}
