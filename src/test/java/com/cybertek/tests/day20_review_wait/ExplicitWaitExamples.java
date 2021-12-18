package com.cybertek.tests.day20_review_wait;

import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitExamples extends TestBase {

    @Test
    public void Test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement triggerButton = driver.findElement(By.xpath("//button[.='Start']"));
        triggerButton.click();

        WebElement userName = driver.findElement(By.id("username"));
      // In order to use explicit wait you need to use WebDriverWait class
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("MikeSmith");

        // when we comment out implicit wait to observe synchronization problem
        // ElementNotInteractableException: element not interactabrl
    }

    @Test
    public void Test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement enable = driver.findElement(By.xpath("//button[.='Enable']"));

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(enable));
        enable.click();
    }
}
