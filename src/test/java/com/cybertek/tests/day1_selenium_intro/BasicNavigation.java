package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1) set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2) create the instance method for driver

        WebDriver driver = new ChromeDriver();

        //3) navigate through tesla homepage
         driver.get("https://www.tesla.com");
         //navigate back. similar to clicking back button on the browser
        driver.navigate().back();
        // pause the code. code will sleep/wait
        Thread.sleep(4000);
        // navigate forward
        driver.navigate().forward();

        Thread.sleep(4000);

        //refresh the page
        driver.navigate().refresh();

        Thread.sleep(2000);

        //navigate to etsy homepage
        driver.navigate().to("https://www.bestbuy.com");

        // get title of the page
        System.out.println("Current title:" + driver.getTitle());

        //close the browser
        driver.close();


    }

}
