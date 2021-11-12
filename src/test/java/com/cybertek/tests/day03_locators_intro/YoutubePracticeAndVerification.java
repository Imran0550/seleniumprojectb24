package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubePracticeAndVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://www.youtube.com";
        driver.get(url);
    driver.findElement(By.name("search_query")).sendKeys("Afg vs sco");
    Thread.sleep(4000);
    driver.findElement(By.id("search-icon-legacy")).click();

    }
}
