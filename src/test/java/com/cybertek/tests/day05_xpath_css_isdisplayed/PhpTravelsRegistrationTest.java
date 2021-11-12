package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpTravelsRegistrationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url = "https://www.phptravels.net";
        driver.get(url);

        WebElement signUp = driver.findElement(By.xpath("//a[@class = 'theme-btn theme-btn-small waves-effect']"));
        signUp.click();
        Thread.sleep(4000);
        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("Sayid Imran");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder = 'Last Name']"));
        lastName.sendKeys("Nazari");
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("5409401395");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
        email.sendKeys("Sayidi_n@yahoo.com");
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("Imran4721@");
        Thread.sleep(6000);
        WebElement submit = driver.findElement(By.xpath("//button[@type = 'submit']"));
        submit.click();
        Thread.sleep(2000);

        String expTitle = "Login - PHPTRAVELS";
        String actTitle = driver.getTitle();

        if(actTitle.equals(expTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Verification failed");
        }

        Thread.sleep(4000);
        WebElement email2 = driver.findElement(By.name("email"));
        email2.sendKeys("Sayidi_n@yahoo.com");
        Thread.sleep(2000);
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("Imran4721@" + Keys.ENTER);
        Thread.sleep(2000);

        String expHeader = "Sayid Imran";
        String actHeader = driver.findElement(By.xpath("//h2[@class = 'sec__title font-size-30 text-white']")).getText();

        if(actHeader.contains(expHeader)){
            System.out.println("Successfully verified");
        }else {
            System.out.println("Verification failed");
        }


    }
}
