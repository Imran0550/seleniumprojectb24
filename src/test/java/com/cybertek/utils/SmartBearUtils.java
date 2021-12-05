package com.cybertek.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

   public static void addProduct(WebDriver driver){
       /**
        * TODO: add selenium steps for adding a new  product
        */
       driver.findElement(By.linkText("Order")).click();

       Select select = new Select(driver.findElement(By.xpath("//select[@name ='ctl00$MainContent$fmwOrder$ddlProduct' ]")));

       Assert.assertEquals(select.getFirstSelectedOption().getText(),"MyMoney");

       select.selectByValue("FamilyAlbum");

       WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
       quantity.sendKeys("2");



   }
}
