package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_ForgotPassword_xpath_css {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "http://practice.cybertekschool.com/forgot_password";
        driver.manage().window().maximize();

        driver.get(url);

        WebElement homeLink = driver.findElement(By.xpath("//a[@class = 'nav-link']"));

        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for = 'email']"));
        WebElement emailFields = driver.findElement(By.xpath("//input[@type = 'text']"));
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//i[@class = 'icon-2x icon-signin']"));
        WebElement poweredByLabel = driver.findElement(By.xpath("//div[@style = 'text-align: center;']"));
        System.out.println(poweredByLabel.getText());

        System.out.println("home link = " +homeLink.isDisplayed());
        System.out.println("email label = " + emailLabel.isDisplayed());
        System.out.println("email field = " + emailFields.isDisplayed());
        System.out.println("retrieve Password Btn = " + retrievePasswordBtn.isDisplayed());
        System.out.println("powered By Label = " + poweredByLabel.isDisplayed());

    }
}
