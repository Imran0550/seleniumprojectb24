package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowsExampleTest {
    String url = "http://practice.cybertekschool.com/windows";
    String demoqa = "https://demoqa.com/browser-windows";
    WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void windowsSet(){
        driver.get(url);
        // get window handle of the current window
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + mainWindowHandle);

        //click on new window
        WebElement newWindowLink = driver.findElement(By.linkText("Click Here"));
        newWindowLink.click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Count of windows = " + windowHandles.size());

        //loop and switch to a different window

        for(String windowHandle : windowHandles){
            driver.switchTo().window(windowHandle);
            System.out.println("Current Window title = " + driver.getTitle());
        }
        
        WebElement text = driver.findElement(By.tagName("h3"));
        System.out.println("text.getText() = " + text.getText());

        //go back to parent window/ main window

        driver.switchTo().window(mainWindowHandle);
        System.out.println("Title after switching back to main window = " + driver.getTitle());
    }
    @Test(priority = 2)
    public void demoqaTest(){
        driver.get(demoqa);

        WebElement newTab = driver.findElement(By.xpath("//button[@id = 'tabButton']"));
        WebElement newWindow = driver.findElement(By.id("windowButton"));
        WebElement newWindowText = driver.findElement(By.id("messageWindowButton"));
        newTab.click();
        newWindow.click();
        newWindowText.click();

        System.out.println("Title of the main page: " + driver.getTitle());

        //Store parent id into a variable
        String current = driver.getWindowHandle();
        //Store all window handle ids into a variable
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total window counts = " + allWindowHandles.size());

        for(String each : allWindowHandles){
            driver.switchTo().window(each);
            //System.out.println("Current window title = " + driver.getTitle());
        }






    }
}