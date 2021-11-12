package com.cybertek.tests.day07_findelements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForgotPassWordFindElements {

    public static void main(String[] args) throws InterruptedException {


        String appUrl = "http://practice.cybertekschool.com/forgot_password";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("count of links: " +links.size());

        // print text of first one
        System.out.println("first link = " + links.get(0).getText());
        System.out.println();
        //print text of second one
        System.out.println("Second link = " + links.get(1).getText());

        //loop and print href value of each one
        for (WebElement link : links) {
            System.out.println("href values: " +link.getAttribute("href"));

        }
        // click on Home link at index 1
        links.get(1).click();

    }
}