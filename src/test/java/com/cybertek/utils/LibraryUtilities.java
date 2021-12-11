package com.cybertek.utils;

import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtilities{

    public static void LoginToLibrary(WebDriver driver){
        driver.get(ConfigurationReader.getProperty("library"));

        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys(ConfigurationReader.getProperty("email"));
        WebElement pass = driver.findElement(By.id("inputPassword"));
        pass.sendKeys(ConfigurationReader.getProperty("pass"));

        driver.findElement(By.cssSelector("button[class = 'btn btn-lg btn-primary btn-block']")).click();
    }
}
