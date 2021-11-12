package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerificationTC1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url = "https://www.facebook.com";
        driver.get(url);

        String expTitle = "Facebook - Log In or Sign Up";
        String actTitle = driver.getTitle();

        if(actTitle.equals(expTitle)){
            System.out.println("Title verified!");
        }else {
            System.out.println("Title not Verified");
        }

    }
}
