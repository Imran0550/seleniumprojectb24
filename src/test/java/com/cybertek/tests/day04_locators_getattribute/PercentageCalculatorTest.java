package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentageCalculatorTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://www.calculator.net";
        driver.get(url);

        //click on percentage calculator

        driver.findElement(By.linkText("Percentage Calculator")).click();
        Thread.sleep(4000);
        
//Verify the title is percentage calculator
        
        String expTitle = "Percentage Calculator";
        System.out.println("Expected title = " + expTitle);
        String actTitle = driver.getTitle();
        System.out.println("actTitle = " + actTitle);
        
        if(actTitle.equals(expTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.findElement(By.name("cpar1")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.name("cpar2")).sendKeys("120000" + Keys.ENTER);
        Thread.sleep(2000);
     String result =  driver.findElement(By.tagName("h2")).getText();
        System.out.println(result);

        if(result.endsWith("24000")){
            System.out.println("pass: calculation is correct");
        }else {
            System.out.println("Fail: calculation is incorrect");
        }


        driver.quit();

    }

}
