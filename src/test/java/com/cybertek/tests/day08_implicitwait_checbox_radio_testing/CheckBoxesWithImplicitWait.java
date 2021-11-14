package com.cybertek.tests.day08_implicitwait_checbox_radio_testing;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxesWithImplicitWait {
    public static void main(String[] args) {

        String url = "http://practice.cybertekschool.com/checkboxes";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //implicit wait command
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        //locate first checkbox using name or id, xpath
        WebElement checkBox1 = driver.findElement(By.xpath("//form//input[@name = 'checkbox1']"));
        //click command will check it
        checkBox1.click();

        //uncheck second checkbox
        WebElement checkBox2 = driver.findElement(By.cssSelector("input[id = 'box2']"));
        checkBox2.click();



        if(!checkBox2.isSelected()){
            checkBox2.click();

        }else {
            System.out.println("checkbox 2 is selected? " + checkBox2.isSelected() );

        }

    }
}
