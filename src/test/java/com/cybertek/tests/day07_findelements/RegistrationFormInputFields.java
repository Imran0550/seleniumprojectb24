package com.cybertek.tests.day07_findelements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationFormInputFields {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String appUrl = "https://form.jotform.com/213106431512137";
        driver.get(appUrl);

        List<WebElement> each = driver.findElements(By.cssSelector("input[type = 'text']"));

//        for(int i=0;i<each.size()-1;i++){
//            each.get(i).sendKeys("wooden Spoon");
//        }
      //another way but better way:)
       for(WebElement each2 : each){
           if(each2.isDisplayed()){
               each2.sendKeys("Wooden Spoon");
           }
       }
      WebElement find = driver.findElement(By.xpath("//"));
    }
}
