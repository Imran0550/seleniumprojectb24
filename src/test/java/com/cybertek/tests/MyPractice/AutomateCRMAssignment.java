package com.cybertek.tests.MyPractice;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomateCRMAssignment {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        String url ="https://login2.nextbasecrm.com" ;
        driver.get(url);
        //helpdesk28@cybertekschool.com
        Thread.sleep(2000);

       WebElement login = driver.findElement(By.xpath("//input[@name = 'USER_LOGIN']"));
       login.sendKeys("helpdesk28@cybertekschool.com");
       Thread.sleep(2000);
       WebElement pass = driver.findElement(By.name("USER_PASSWORD"));
       pass.sendKeys("UserUser");
       Thread.sleep(2000);
       WebElement loginbtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
       loginbtn.click();

       String loginUrl = "https://login2.nextbasecrm.com/stream/?loginyes";
       String currentUrl = driver.getCurrentUrl();

       if(currentUrl.equals(loginUrl)){
           System.out.println("PASSED: TEST PASSED!");
       }else {
           System.out.println("OPS,FAILED");
       }

    }
}
