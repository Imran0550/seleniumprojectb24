package com.cybertek.tests.day13_faker_practice_browserutil_properties;

import com.cybertek.utils.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RegistrationFormNegativeTest extends RegistrationFormTestBase{

    @Test
    public void invalidFirstNameTest(){
        //do not enter any value and click on sign up
        //"first name is required" error msg should be displayed

        WebElement signUp = driver.findElement(By.id("wooden_spoon"));
        signUp.click();

        //wait for 1 sec
        BrowserUtil.sleep(1);

        //verify error message is displayed

        WebElement error = driver.findElement(By.xpath("//small[. = 'first name is required']"));

        assertTrue(error.isDisplayed(), "Error message is not displayed");

        //type 123 and verify the error message

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("123");

        WebElement message = driver.findElement(By.xpath("//*[. = 'first name can only consist of alphabetical letters']"));

        assertTrue(message.isDisplayed(),"Error message is not displayed");
    }
}
