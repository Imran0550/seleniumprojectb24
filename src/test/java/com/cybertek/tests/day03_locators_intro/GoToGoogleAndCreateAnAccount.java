package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToGoogleAndCreateAnAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://www.google.com";
        driver.get(url);
        driver.findElement(By.name("q")).sendKeys("www.cydeo.com" + Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("C")).click();
        Thread.sleep(2000);



    }
}
