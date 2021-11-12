package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.google.com";
        driver.get(url);

        driver.findElement(By.name("q")).sendKeys("apple");
Thread.sleep(4000);
        //locate and click on search button

        driver.findElement(By.name("btnK")).click();

        String actTitle = driver.getTitle();
        String expTitle = "apple";

        if(actTitle.startsWith(expTitle)){
            System.out.println("PASS: Title matched");
        }else {
            System.out.println("FAILED: Title mismatched");
        }
driver.quit();
    }
}
