package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerificationTC4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url = "https://www.facebook.com";
        driver.get(url);

        String expected = "registration_form";
        System.out.println(expected);
        String actual = driver.findElement(By.className("_8esh")).getAttribute("href");
        System.out.println("actual = " + actual);

        if(actual.equals(expected)){
            System.out.println("Verified!");
        }else {
            System.out.println("Verification failed");
        }
    }
}
