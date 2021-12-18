package com.cybertek.tests.day22_explicitwait_review;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CherCherWaitPractice extends TestBase {

    @BeforeMethod
    public void goToHomePAge(){
        driver.get(ConfigurationReader.getProperty("selenium"));
    }
    @Test
    public void waitForAlertTest(){
        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();

    }

    @Test
    public void waitForButtonEnabledTest(){
        WebElement button = driver.findElement(By.cssSelector("#display-other-button"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver,11);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#hidden"))));
        System.out.println("Button is now visible");
    }

@Test
    public void waitForTheText(){
        WebElement button = driver.findElement(By.cssSelector("#populate-text"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver,11);

        wait.until(ExpectedConditions.textToBe(By.id("h2"),"Selenium Webdriver"));
        System.out.println("Selenium Webdriver is visible");
    }

    @Test
    public void checkBoxSelectedTest(){

        WebElement button = driver.findElement(By.id("checkbox"));
        button.click();

        WebElement check = driver.findElement(By.xpath("//input[@type ='checkbox']"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeSelected(check));
        System.out.println("checkbox = " + check.isSelected());




    }
}
