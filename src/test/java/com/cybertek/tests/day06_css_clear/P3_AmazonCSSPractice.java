package com.cybertek.tests.day06_css_clear;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_AmazonCSSPractice {
    public static void main(String[] args) throws InterruptedException {

        String appUrl = "https://www.amazon.com/";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.navigate().to(appUrl);
//
//        WebElement searchField = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
//        searchField.sendKeys("wooden spoon");

        WebElement searchField = driver.findElement(By.cssSelector("input[dir = 'auto']"));
        searchField.sendKeys("Wooden spoon");
        Thread.sleep(2000);
        WebElement clickOnSearch = driver.findElement(By.cssSelector("input[value = 'Go']"));
        clickOnSearch.click();

        //clear the search input box then search for iphone 13 case;

        //searchField.clear(); in order for this to work we have to refresh above code again, because it is a new page
         searchField = driver.findElement(By.cssSelector("input[aria-label = 'Search']"));
         clickOnSearch = driver.findElement(By.cssSelector("input[type = 'submit']"));

         // clear the value of search field
        searchField.clear();

        Thread.sleep(2000);


        searchField.sendKeys("Iphone 13 wooden case");
        clickOnSearch.click();

        System.out.println(searchField.isDisplayed());




    }
}
