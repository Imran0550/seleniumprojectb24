package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerificationTC1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://zero.webappsecurity.com/login.html";
        driver.get(url);

        String expHeader = "Log in to ZeroBank";
       String actHeader = driver.findElement(By.tagName("h3")).getText();


       if(actHeader.equals(expHeader)){
           System.out.println("Header Verified! yay");
       }else {
           System.out.println("Verification failed, LOSER");
       }

driver.quit();


    }
}
