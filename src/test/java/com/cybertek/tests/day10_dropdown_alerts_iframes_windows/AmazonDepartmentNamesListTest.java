package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class AmazonDepartmentNamesListTest {

    String url = "https://www.amazon.com/";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

     driver = WebDriverFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get(url);

    }
    @Test
    public void amazonDepartmentTest() throws InterruptedException {

        String title = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(driver.getTitle(),title);

        //Assert that "All" option is selected by default

        Select departments = new Select(driver.findElement(By.id("searchDropdownBox")));

       String selectedOptions = departments.getFirstSelectedOption().getText();
      assertEquals(selectedOptions,"All Departments");

        List<WebElement> allDepartments = departments.getOptions();
        int count = allDepartments.size();
        System.out.println("Count of all: " + count);

        assertTrue(count > 10, "Are you drunk!🤷🏻‍");
        //....=> a remainder I know you won't come to this page very often :)))))

        // loop through and print all otions

        int count1 =0;

        for(WebElement each : allDepartments){

            System.out.println("each " + count1 +":" + each.getText());
            count1++;
        }

        // loop using lambda expression
        System.out.println("====LAMDA=====");
        allDepartments.forEach(n -> System.out.println(n.getText()));

        // select each item by order and wait 400 ms in between

        for(WebElement each2 : allDepartments){
            departments.selectByVisibleText(each2.getText());

        }




    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test(enabled = false)
    public void testDemo(){
        System.out.println("test demo is running");
    }

}
