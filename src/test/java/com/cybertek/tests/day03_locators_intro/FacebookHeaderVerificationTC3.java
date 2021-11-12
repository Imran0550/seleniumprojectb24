package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerificationTC3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com";
        driver.get(url);

        String expHeader = "Connect with friends and the world around you on Facebook.";
        System.out.println(expHeader);
        String actTitle = driver.findElement(By.tagName("h2")).getText();
        System.out.println("actTitle = " + actTitle);

        if (actTitle.equals(expHeader)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }


    }
}
