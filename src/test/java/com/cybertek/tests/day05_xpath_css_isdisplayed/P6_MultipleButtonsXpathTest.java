package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_MultipleButtonsXpathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String appUrl = "http://practice.cybertekschool.com/multiple_buttons";
        driver.manage().window().maximize();
        driver.get(appUrl);

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick = 'button1()']"));

        button1.click();

        WebElement result = driver.findElement(By.xpath("//p[@id = 'result']"));
        System.out.println("result = " +result.getText());

        Thread.sleep(4000);

        //Locate button using xpath and check if it is currently displayed on the page

        WebElement button2 = driver.findElement(By.xpath("//button[text() = 'Button 2']"));
        // then click it
        if(button2.isDisplayed()){
            System.out.println("PASS: Button 2 is displayed");
            button2.click();
        }else {
            System.out.println("FAILED: button 2 not displayed");
        }


        Thread.sleep(4000);
        WebElement result2 = driver.findElement(By.xpath("//p[@id = 'result']"));






    }
}
