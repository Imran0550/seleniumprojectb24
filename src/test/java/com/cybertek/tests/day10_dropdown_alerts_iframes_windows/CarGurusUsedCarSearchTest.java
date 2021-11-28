package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CarGurusUsedCarSearchTest {

    String url = "https://www.cargurus.com";
    WebDriver driver; // can use in every method

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(
                10, TimeUnit.SECONDS
        );
        driver.get(url);
    }

    @Test
    public void SearchForMinivanTest(){

        String expectedTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";

        Assert.assertEquals(driver.getTitle(),expectedTitle);

        // select toyota
        Select select = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
        select.selectByVisibleText("Toyota");

        // select sienna

        Select model = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
        model.selectByValue("d308");

        // type zip code

        WebElement zip = driver.findElement(By.id("dealFinderZipUsedId_dealFinderForm"));
        zip.sendKeys("22405");




        // print currently selected options of make and model

        System.out.println("Selected Make = " + select.getFirstSelectedOption().getText());
        System.out.println("Selected Model = " + model.getFirstSelectedOption().getText());

        // click search

        WebElement search = driver.findElement(By.xpath("//div//input[@id = 'dealFinderForm_0']"));
        search.click();

        // get the result

        WebElement result = driver.findElement(By.xpath("//span[@class = 'oKvYB4']/strong[2]"));
        System.out.println(result.getText());

        // make sure the count is more than 0

        int count = Integer.parseInt(result.getText());

        Assert.assertTrue(count > 0, "No Good!");

    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }



}
