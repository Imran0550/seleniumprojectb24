package com.cybertek.tests.day08_implicitwait_checbox_radio_testing;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.cybertekschool.com/radio_buttons";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //wait upto 10 seconds while finding elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        WebElement red = driver.findElement(By.id("red"));

        if(!red.isSelected()){
            red.click();
        }

        //select football
        WebElement football = driver.findElement(By.xpath("//div[@class = 'radio']//input[@id ='football']"));

        if(!football.isSelected()){
            System.out.println("SELECTING FOOTBALL");
            football.click();
        }

        //verify football is selected

        if(football.isSelected()){
            System.out.println("PASS: football is selected");
        }else {
            System.out.println("FAILED: football is not selected");
        }

        List<WebElement> allButtons = driver.findElements(By.xpath("//input[@type = 'radio']"));
        System.out.println(allButtons.size());

        for(WebElement each : allButtons){
            each.click();
            Thread.sleep(1000);

            if(each.isEnabled()){
                System.out.println("Enabled");
            }else if(each.isDisplayed()) {
                System.out.println("Disabled");
            }
        }
        driver.quit();
    }
}
