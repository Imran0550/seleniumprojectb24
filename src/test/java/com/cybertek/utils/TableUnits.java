package com.cybertek.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableUnits {

    public static void verifyOrders(WebDriver driver, String name){

    WebElement all = driver.findElement(By.xpath("//table[@id='table1']"));

        Assert.assertTrue(all.getText().contains(name));

    }

    @Test
    public void TC001(){

        Driver.getDriver().get(ConfigurationReader.getProperty("cyber"));
        verifyOrders(Driver.getDriver(), "Frank");

    }
}
