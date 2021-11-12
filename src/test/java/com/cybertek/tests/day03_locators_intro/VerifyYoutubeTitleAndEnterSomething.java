package com.cybertek.tests.day03_locators_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyYoutubeTitleAndEnterSomething {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://www.youtube.com";
        driver.get(url);


        String expTitle = "YouTube";
        String actTitle = driver.getTitle();

        if(actTitle.equals(expTitle)){
            System.out.println("Verified");
        }else {
            System.out.println(" not matched");
        }

        Thread.sleep(4000);


    }
}
