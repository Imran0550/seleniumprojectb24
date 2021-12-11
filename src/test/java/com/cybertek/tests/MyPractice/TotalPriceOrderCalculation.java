package com.cybertek.tests.MyPractice;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TotalPriceOrderCalculation extends TestBase {

public static void getLink(String str){
    Driver.getDriver().findElement(By.partialLinkText(str)).click();
}


    @Test
    public void TC001() throws InterruptedException{
    int totalPrice = 0;
        driver.get(ConfigurationReader.getProperty("demo"));
       getLink("Laptops");
       Thread.sleep(2000);
       getLink("Sony vaio i7");
       Thread.sleep(2000);

       String price = driver.findElement(By.tagName("h3")).getText().substring(1,4);
       totalPrice += Integer.parseInt(price);

       getLink("Add to cart");
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(2000);

        getLink("Home");
       getLink("Phones");
       Thread.sleep(2000);
       getLink("Iphone 6 32gb");

        String price1 = driver.findElement(By.tagName("h3")).getText().substring(1,4);

        totalPrice += Integer.parseInt(price1);
        System.out.println(price);
        getLink("Add to cart");
        Thread.sleep(2000);
        alert.accept();

        System.out.println(totalPrice);

    }
}
