package com.cybertek.tests.day13_faker_practice_browserutil_properties;

import com.cybertek.utils.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationFormTest extends RegistrationFormTestBase {

    Faker faker = new Faker();
@Test
    public void RegistrationFormTest() throws InterruptedException{

       WebElement name = driver.findElement(By.name("firstname"));
       name.sendKeys(faker.name().firstName());

       WebElement lastName = driver.findElement(By.name("lastname"));
       lastName.sendKeys(faker.name().lastName());
enterUsername(faker.name().username().replace(".",""));


       WebElement emailAddress = driver.findElement(By.name("email"));
       emailAddress.sendKeys(faker.internet().emailAddress());

       WebElement passWord = driver.findElement(By.name("password"));
       passWord.sendKeys(faker.internet().password());

       WebElement mobile = driver.findElement(By.name("phone"));
       mobile.sendKeys(faker.phoneNumber().cellPhone()
       .replace("(","").replace(")","").replace(".","-").replace(" ","-"));

       WebElement maleRadio = driver.findElement(By.xpath("//input[@value = 'male']"));
       maleRadio.click();

       WebElement DOB = driver.findElement(By.xpath("(//input[@type = 'text'])[5]"));
       DOB.sendKeys("05/29/2001");

    Select department = new Select(driver.findElement(By.cssSelector("select[name = 'department']")));
    department.selectByIndex(faker.number().numberBetween(1,9));
int count =0;
    for(WebElement each : department.getOptions()){
        System.out.println( count + " " +each.getText());
        count++;
    }
    System.out.println("------------------------");
    Select jobTitle = new Select(driver.findElement(By.xpath("//select[@name = 'job_title']")));
    jobTitle.selectByVisibleText("SDET");
    int countA = 0;
    for (WebElement each : jobTitle.getOptions()){
        System.out.println(countA + " " +each.getText());
        countA++;
    }

    List<WebElement> list = driver.findElements(By.xpath("//input[@type= 'checkbox']"));

    list.forEach(e -> e.click());

//    for(WebElement each : list){
//        each.click();
//    }

      // click on signUp button
    WebElement signUp = driver.findElement(By.id("wooden_spoon"));
    signUp.click();

    // verify the message

    WebElement message = driver.findElement(By.tagName("p"));
    String message1 = message.getText();

    Assert.assertEquals(message1,"You've successfully completed registration!");


      }

      public void enterUsername (String username){
    WebElement username1 = driver.findElement(By.name("username"));
    username1.sendKeys(username);
      }

}
/*
TC#6: Cybertek registration form confirmation
Note: Use JavaFaker when possible.
1. Open browser
2. Go to website: http://practice.cybertekschool.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.
 */