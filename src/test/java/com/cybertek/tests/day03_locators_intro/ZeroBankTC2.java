package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://zero.webappsecurity.com/login.html";
        driver.get(url);

       String expected = "Zero Bank";
       String actual =driver.findElement(By.className("brand")).getText();
        System.out.println("Actual: " + actual);

       if(actual.equals(expected)){
           System.out.println("PASSED: YAY");
       }else {
           System.out.println("FAILED: LOSER");
       }

       String href = driver.findElement(By.className("brand")).getAttribute("href");
        System.out.println("href: " + href);
    }
}
