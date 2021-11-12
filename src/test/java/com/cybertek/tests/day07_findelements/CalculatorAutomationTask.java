package com.cybertek.tests.day07_findelements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAutomationTask {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String appUrl = "https://www.calculator.net";
        int num1 = 5;
        int num2 = 3;
        int expectedRes = 8;

        driver.navigate().to(appUrl);

        WebElement click5 = driver.findElement(By.cssSelector("span[onclick = 'r(5)']"));
        WebElement plusSign = driver.findElement(By.xpath("//span[@class = 'sciop']"));
        WebElement click3 = driver.findElement(By.cssSelector("span[onclick = 'r(3)']"));
        WebElement equals = driver.findElement(By.xpath("//*[.='=']"));

        click5.click();
        Thread.sleep(2000);
        plusSign.click();
        Thread.sleep(2000);
        click3.click();
        Thread.sleep(2000);
        equals.click();
        Thread.sleep(2000);

        String result = driver.findElement(By.cssSelector("div[id = 'sciOutPut']")).getText().replace(" ", "");

        System.out.println(num1 + " + " + num2 + " = " + result);

        int actualResult = Integer.parseInt(result);

        System.out.println(actualResult);


        if (actualResult == expectedRes) {
            System.out.println("Result matched: PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.quit();

    }
}
