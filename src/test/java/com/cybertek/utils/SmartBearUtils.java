package com.cybertek.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SmartBearUtils {

   public static void loginToSmartBear(WebDriver driver){

       WebElement userName = driver.findElement(By.name("ctl00$MainContent$username"));
       userName.sendKeys("Tester");
       WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
       password.sendKeys("test");
       WebElement login = driver.findElement(By.name("ctl00$MainContent$login_button"));
       login.click();

       Assert.assertEquals(driver.getTitle(),"Web Orders", "Failed to login to application");
   }
}
