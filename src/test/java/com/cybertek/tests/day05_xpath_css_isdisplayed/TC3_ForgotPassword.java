package com.cybertek.tests.day05_xpath_css_isdisplayed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ForgotPassword {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "http://practice.cybertekschool.com/forgot_password";
        driver.get(url);

        driver.findElement(By.name("email")).sendKeys("xevisek704@niekie.com");
        driver.findElement(By.id("form_submit")).click();
        Thread.sleep(2000);

        String expUrl = "email_sent";
        System.out.println("expUrl = " +expUrl);
        String actUrl = driver.getCurrentUrl();
        System.out.println("actUrl = " + actUrl);

        if(actUrl.contains(expUrl)){
            System.out.println("Verification successful");
        }else {
            System.out.println("Verification failed");
        }

        WebElement message = driver.findElement(By.name("confirmation_message"));
        System.out.println("message = " + message.getText());

        String expMessage = "Your e-mail's been sent!";
        String actMessage = message.getText();

        if(actMessage.equalsIgnoreCase(expMessage)){
            System.out.println("Verified!");
        }else {
            System.out.println("Not verified");
        }

        System.out.println("Name attribute value of message element = " + message.getAttribute("name"));

        driver.quit();
    }
}
