package com.cybertek.tests.day06_css_clear;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_CSS_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        String appUrl = "http://practice.cybertekschool.com/forgot_password";
        driver.get(appUrl);
        WebElement enterEmail = driver.findElement(By.cssSelector("input[name = 'email']"));
        enterEmail.sendKeys("jdajva@faj.com");
        // wait a second and clear > type different email
        Thread.sleep(4000);

        enterEmail.clear(); // clear and make empty
        enterEmail.sendKeys("Student2@gmail.com");

        //loop

        for(int i=0;i<=10;i++){
            Thread.sleep(1234);

            enterEmail.clear();

            enterEmail.sendKeys("studen"+i+"@gmail.com");
        }
    }
}
