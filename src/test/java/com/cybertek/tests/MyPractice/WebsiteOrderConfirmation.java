package com.cybertek.tests.MyPractice;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class WebsiteOrderConfirmation extends TestBase {
Faker faker = new Faker();
    public static void getLink(String str){
        Driver.getDriver().findElement(By.partialLinkText(str)).click();
    }
    @Test
    public void TC001(){
        int totalPrice = 0;
        driver.get(ConfigurationReader.getProperty("demo"));
        getLink("Laptops");
BrowserUtil.sleep(2);
        getLink("Sony vaio i7");

        String price = driver.findElement(By.tagName("h3")).getText().substring(1,4).trim();

        totalPrice += Integer.parseInt(price);
        System.out.println(price);

        getLink("Add to cart");
        BrowserUtil.sleep(2);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        getLink("Home");
        getLink("Phones");
        BrowserUtil.sleep(2);
        getLink("Iphone 6 32gb");

        String price2 = driver.findElement(By.tagName("h3")).getText().substring(1,4).trim();

        totalPrice+=Integer.parseInt(price2);
        System.out.println(price2);

        getLink("Add to cart");
        BrowserUtil.sleep(2);
        alert.accept();

        getLink("Home");
        getLink("Monitors");
        BrowserUtil.sleep(2);
        getLink("Apple monitor 24");

        String price3 = driver.findElement(By.tagName("h3")).getText().substring(1,4).trim();
        totalPrice += Integer.parseInt(price3);
        System.out.println(price3);

        getLink("Add to cart");
        BrowserUtil.sleep(2);
        alert.accept();

        getLink("Cart");

       WebElement delete = driver.findElement(By.xpath("//*[.='Iphone 6 32gb']/..//a[.='Delete']"));
       BrowserUtil.sleep(1);
       delete.click();

       totalPrice -= Integer.parseInt(price2);
BrowserUtil.sleep(2);

String tP = driver.findElement(By.tagName("h3")).getText().trim();

 int toP = Integer.parseInt(tP);

        System.out.println(toP);
        System.out.println(totalPrice);

        Assert.assertEquals(totalPrice,toP);

        driver.findElement(By.xpath("//button[@data-target='#orderModal']")).click();

        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys(faker.name().fullName());

        WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
        country.sendKeys(faker.country().name());

        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys(faker.address().city());
        WebElement card = driver.findElement(By.xpath("//input[@id='card']"));
        card.sendKeys(faker.number().digits(16));
        WebElement month = driver.findElement(By.xpath("//input[@id='month']"));
        month.sendKeys("December");
        WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
        year.sendKeys("2023");

        driver.findElement(By.xpath("//button[@onclick = 'purchaseOrder()']")).click();

        BrowserUtil.sleep(1);

        String lastT = driver.findElement(By.xpath("//p[1][@class ='lead text-muted ' ]/br[1]")).getText();
        System.out.println(lastT);


    }
}
