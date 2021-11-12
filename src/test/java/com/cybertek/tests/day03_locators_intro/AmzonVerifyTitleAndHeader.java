package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonVerifyTitleAndHeader {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://www.amazon.com";
        driver.get(url);

        String expTitle = "Amazon.com. Spend less. Smile more.";
        System.out.println(expTitle);
        String actTitle = driver.getTitle();
        System.out.println("actTitle = " + actTitle);

        if(actTitle.equals(expTitle)){
            System.out.println("PASSED!");
        }else {
            System.out.println("FAILED");
        }
    }
}
