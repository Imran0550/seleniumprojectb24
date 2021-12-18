package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AllOrdersPage extends SmartBearDashboardPage{

    //Do I have to put constructor? No
    // constructor is not inherited however, child classes has to call parent class constructor

    @FindBy (id = "ctl00_MainContent_btnDelete") public WebElement deleteButton;

    public void checkBox(String name){
        Driver.getDriver().findElement(By.xpath("//td[.='"+name+"']/..//input[@type='checkbox']")).click();
        deleteButton.click();
        getLink("Logout");
    }
}
