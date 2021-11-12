package com.cybertek.tests.MyPractice;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTaskAndLogo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url = "https://www.google.com";
        driver.get(url);
        WebElement search = driver.findElement(By.xpath("//input[@title = 'Search']"));

//        if(search.isDisplayed()){
//            search.sendKeys("Afghanistan cricket team" + Keys.ENTER);
//        }
//        Thread.sleep(2000);
//
//        WebElement delete = driver.findElement(By.cssSelector("input[name = 'q']"));
//        delete.clear();
//
//        delete.sendKeys("Pakistan cricket team" + Keys.ENTER);

        WebElement search2 = driver.findElement(By.tagName("a"));
        search2.getAttribute("href");
        search2.click();

    }
}
