package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
        String url = "https://www.google.com";
        driver.get(url);

        //locate the search field and assign to WebElement variable
        WebElement searchField = driver.findElement(By.name("q"));
        System.out.println("class value = " + searchField.getAttribute("class"));
        System.out.println("max length = " + searchField.getAttribute("maxlength") );

       searchField.sendKeys("afg vs pak");

       //read the value that is in the search field

        System.out.println(searchField.getAttribute("value"));

        //print name value of the WebElement
        System.out.println(searchField.getAttribute("name"));

    }
}
