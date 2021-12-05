package com.cybertek.tests.day14_webtables_properties;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableDemoTest {

    WebDriver driver;
    String url = "http://practice.cybertekschool.com/tables";


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage()
                .timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }
    @Test
    public void readFromTableTest(){
        //print table data as a single, not so common,but useful sometimes

        WebElement table1 = driver.findElement(By.xpath("//table[@id = 'table1']"));
        System.out.println("table1.getText() = " + table1.getText());

        //verify tconway@earthlink this email is anywhere in the table

        assertTrue(table1.getText().contains("tconway@earthlink"));

        //print all column name

        WebElement column = driver.findElement(By.xpath("//table[@id = 'table1']/thead/tr"));
        System.out.println("column = " + column.getText());

        //print each column name in separate lines using a loop and find elements method
        List<WebElement> columnNames = driver.findElements(By.xpath("//table[@id ='table1']/thead/tr/th"));

        columnNames.forEach(e -> System.out.println(e.getText()));

        //print first column + first cell data
        WebElement firstCol = driver.findElement(By.xpath("//table[@id ='table1']/tbody/tr[1]/td[1]"));
        System.out.println("firstCol = " + firstCol.getText());

        //System.out.println("col 1, row 4 = " + getCellData(1,4));


    }
    @Test
    public void getAllColumnData(){
        //print all names
        // print all emails

        List<WebElement> names = driver.findElements(By.xpath("//table[@id ='table1']/tbody/tr/td[2]"));
        List<WebElement> emails = driver.findElements(By.xpath("//table[@id ='table1']/tbody/tr/td[3]"));
        for(int i=0;i<names.size();i++){
            System.out.println(i+1 + " - " +names.get(i).getText() + " = " + emails.get(i).getText());
        }

    }

    @Test
    public void printAllTableDataTest(){

        //get rows count and assign to rows count variable and print it
        int rowsCount =driver.findElements(By.xpath("//table[@id ='table1']/tbody/tr")).size();

        for(int r = 1;r<rowsCount;r++){

            for(int c =1 ; c <= 6; c++){
                String value = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr["+ r +"]/td["+c+"]")).getText();
                System.out.println(value);
            }
        }





    }

    @Test
    public void readNeighborCell(){
        WebElement johnEmail = driver.findElement(By.xpath("//table[@id ='table1']//td[.='John']/following-sibling::td[1]"));
        System.out.println("johnEmail = " + johnEmail.getText());
        WebElement johnFirstName = driver.findElement(By.xpath("//table[@id ='table1']//td[.='John']/preceding-sibling::td"));
        System.out.println("johnFirstName.getText() = " + johnFirstName.getText());
        
    }

//    public String getCellData(int row, int col){
//        String xpathStr = "//table[@id = 'table1']/body/tr/["+row+"]/td["+col+"]";
//
//        return driver.findElement(By.xpath(xpathStr)).getText();
//    }

}
