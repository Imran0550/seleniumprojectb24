package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerificationTC2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.facebook.com";
        driver.get(url);

        driver.findElement(By.name("email")).sendKeys("Jamesbond63637@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.name("pass")).sendKeys("James784" + Keys.ENTER);
        Thread.sleep(1000);

        String expTitle = "Facebook - Log In or Sign Up";
        System.out.println(expTitle);
        String actTitle = driver.getTitle();
        System.out.println("actTitle = " + actTitle);

        if(actTitle.equals(expTitle)){
            System.out.println("PASSED: Title verified");
        }else {
            System.out.println("FAILED: Title not verified");
        }

    }
}
