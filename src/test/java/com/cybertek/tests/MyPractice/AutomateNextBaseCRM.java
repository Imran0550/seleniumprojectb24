package com.cybertek.tests.MyPractice;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomateNextBaseCRM {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url = "https://login2.nextbasecrm.com/";
        driver.get(url);
        WebElement login = driver.findElement(By.cssSelector("input[name ='USER_LOGIN']"));
        WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
        WebElement clickLogin = driver.findElement(By.className("login-btn"));

        login.sendKeys("helpdesk28@cybertekschool.com");
        Thread.sleep(2000);
        pass.sendKeys("UserUser");
        Thread.sleep(2000);
        clickLogin.click();
        WebElement poll = driver.findElement(By.xpath("//span[@id = 'feed-add-post-form-tab-vote']"));
        poll.click();
        Thread.sleep(2000);
       WebElement q1 = driver.findElement(By.xpath("//input[@ placeholder= 'Question ']"));
       WebElement q2 = driver.findElement(By.cssSelector("input[id = 'answer_0__0_']"));
       WebElement q3 = driver.findElement(By.xpath("//input[@placeholder = 'Answer  2']"));

       q1.sendKeys("Automation is fun");
       Thread.sleep(2000);
       q2.sendKeys("Yes");
       Thread.sleep(2000);
       q3.sendKeys("Yes");

       driver.switchTo().frame(0);
       WebElement text = driver.findElement(By.xpath("//body[@contenteditable = 'true']"));
       text.sendKeys("Hello Universe!");

       driver.switchTo().defaultContent();
       Thread.sleep(2000);

       WebElement send = driver.findElement(By.cssSelector("button[id = 'blog-submit-button-save']"));
       send.click();




    }
}