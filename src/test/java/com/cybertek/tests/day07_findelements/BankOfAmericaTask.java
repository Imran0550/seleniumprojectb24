package com.cybertek.tests.day07_findelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaTask {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.bankofamerica.com";
        driver.get(url);

        WebElement login = driver.findElement(By.xpath("//input[@name = 'onlineId1']"));
        login.sendKeys("Siri1395");
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.cssSelector("input[name = 'passcode1']"));
        pass.sendKeys("1234");
        Thread.sleep(2000);
        WebElement signin = driver.findElement(By.id("signIn"));
        signin.click();
        Thread.sleep(2000);
        WebElement clickSearch = driver.findElement(By.xpath("//input[@placeholder = 'How can we help you?']"));
        clickSearch.sendKeys("Fico score " + Keys.ENTER);
        Thread.sleep(2000);
        WebElement click = driver.findElement(By.cssSelector("a[name = 'Search Module - Search Results - Result 1']"));
        click.click();


    }
}
