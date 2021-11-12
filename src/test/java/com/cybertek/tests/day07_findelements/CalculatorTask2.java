package com.cybertek.tests.day07_findelements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorTask2 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String appUrl = "https://www.calculator.net";
        int num1 = 5;
        int num2 = 3;
        int expectedRes = 8;

        driver.navigate().to(appUrl);

        WebElement num1Elem = driver.findElement(By.xpath("//span[.='"+ num1 +"']"));
        WebElement num2Elem = driver.findElement(By.xpath("//span[.= '" + num2+"']"));
        WebElement plusElem = driver.findElement(By.xpath("//span[.='+']"));
        WebElement equalElem = driver.findElement(By.xpath("//span[.= '=']"));

        num1Elem.click();
        plusElem.click();
        num2Elem.click();
        equalElem.click();

        WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        String rs2 = result.getText().trim();

        int a = Integer.parseInt(rs2);

        if(a == expectedRes ){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}