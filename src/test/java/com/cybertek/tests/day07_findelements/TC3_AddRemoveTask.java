package com.cybertek.tests.day07_findelements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3_AddRemoveTask {
    public static <ForEach> void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String appUrl = "http://practice.cybertekschool.com/add_remove_elements/";
        driver.manage().window().maximize();
        driver.get(appUrl);

        WebElement add = driver.findElement(By.xpath("//button[@onclick = 'addElement()']"));

        for(int i=0;i<50;i++){
            add.click();
        }
        //verify 50 delete button is displayed
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));

        if(deleteButtons.size()==50){
            System.out.println("Pass");
        }else {
            System.out.println("You need more buttons");
        }

        //ForEach method with lambda expression(->)
        deleteButtons.forEach(remove -> remove.click());

        //verify delete buttons == 0
        List<WebElement> deleteButtons2 = driver.findElements(By.xpath("//button[.='Delete']"));

        if(deleteButtons2.isEmpty()) {
            System.out.println("All buttons deleted successfully");
        }else {
            System.out.println("Failed");
        }





    }
}
