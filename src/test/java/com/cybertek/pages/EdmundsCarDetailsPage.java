package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import static org.testng.Assert.*;

public class EdmundsCarDetailsPage extends BasePage{

    @FindBy(xpath = "//span[@class='d-inline-block']")
    public WebElement priceRange;


    public String result(){
        return priceRange.getText();
    }

    @Override
    public void isCurrentPage(){
       assertTrue(driver.getTitle().contains("2022 Toyota Highlander Prices, Reviews, and Pictures | Edmunds"));
    }
}
