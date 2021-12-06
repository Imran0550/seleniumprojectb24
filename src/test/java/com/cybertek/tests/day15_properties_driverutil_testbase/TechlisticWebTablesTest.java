package com.cybertek.tests.day15_properties_driverutil_testbase;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TechlisticWebTablesTest extends TestBase {
    /**
     * TODO: Goto this url = "https://www.techlistic.com/p/demo-selenium-practice.html"
     * TODO: Assert current url contains "techlistic"
     * print all Building names
     */
    @Test
    public void tallBuildingTest(){
             driver.get(ConfigurationReader.getProperty("techlisticAppUrl"));

       List<WebElement> names = driver.findElements(By.xpath("//table[@class = 'tsc_table_s13']/tbody/tr/th"));

       names.forEach(e -> System.out.println(e.getText()));

       WebElement first = driver.findElement(By.xpath("//table[@class = 'tsc_table_s13']/tbody/tr[1]"));

       Assert.assertTrue(first.getText().contains("829m"));

        System.out.println(first.getText());

        Assert.assertTrue(driver.getCurrentUrl().contains("techlistic"));

        WebElement numberOfTables = driver.findElement(By.xpath("(//table[@class = 'tsc_table_s13']//td[1])[1]"));

        System.out.println("Number of buildings = " + numberOfTables.getText().substring(0,1));



    }
}
