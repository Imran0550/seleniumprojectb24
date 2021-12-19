package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is parent class for all page object classes
 */

public abstract class BasePage {
     //WebDriver variable just in case  any children need
    protected WebDriver driver;

    @FindBy(xpath = "//img[@alt='Home']")
    public WebElement edmundsLogo;


    @FindBy(linkText = "New Car Pricing")
    public WebElement newCarPricingLink;

    public BasePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void goToNewCarPricingPage(){
        newCarPricingLink.click();
    }


    /**
     * abstract method to be implemented by child page object classes
     * This is to verify that we are at the correct page
     * using title of the page or anything other
     * @param title
     */

    public abstract void isCurrentPage();
}
