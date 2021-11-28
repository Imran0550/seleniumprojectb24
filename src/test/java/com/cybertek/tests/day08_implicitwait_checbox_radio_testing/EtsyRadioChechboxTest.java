package com.cybertek.tests.day08_implicitwait_checbox_radio_testing;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EtsyRadioChechboxTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.etsy.com";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //implicit wait command
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        //search for wooden spoon
        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.sendKeys("Wooden Spoon "+ Keys.ENTER);

        //click on All filters
        WebElement allFilters = driver.findElement(By.id("search-filter-button"));
        allFilters.click();

        //select free shipping
        WebElement freeShipping = driver.findElement(By.cssSelector("label[for = 'special-offers-free-shipping']"));
        freeShipping.click();

        WebElement sale = driver.findElement(By.xpath("//label[@for = 'special-offers-on-sale']"));
        sale.click();
        Thread.sleep(2000);

        WebElement under25 = driver.findElement(By.xpath("//div[@class = 'wt-radio wt-radio--small wt-mb-xs-1 ']//label[@for='price-input-1']"));
        under25.click();
        Thread.sleep(2000);

        WebElement apply = driver.findElement(By.xpath("//button[@aria-label = 'Apply']"));
        apply.click();

        WebElement resultCount = driver.findElement(By.xpath("(//span[contains(text(),'result')])[1]"));
        System.out.println("Result = " + resultCount.getText());
        driver.quit();

    }
}
