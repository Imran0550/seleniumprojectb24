package com.cybertek.tests.MyPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTeslaTitleAndVerifyIt {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "https://www.tesla.com";

        driver.get(url);

        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();


        if(title.equals("Electric Cars, Solar & Clean Energy | Tesla")){
            System.out.println("PASS: title verified!");
        }else {
            System.out.println("FAIL: title not verified");
        }

        if(currentUrl.equals(url)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        System.out.println("currentUrl = " + currentUrl);

    }
}
