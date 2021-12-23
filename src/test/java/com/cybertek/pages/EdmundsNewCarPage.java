package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.testng.Assert.*;

public class EdmundsNewCarPage extends BasePage{


    @FindBy(name = "select-make")
    public WebElement make;

    @FindBy(name = "select-model")
    public WebElement model;

    @FindBy(xpath = "//input[@data-tracking-id = 'new_cars_index_mmy_make_model_tab_zip_code_entry']")
    public WebElement zipCode;

    @FindBy(xpath = "//div[@class='d-flex col-12 col-md-4 col-xl-4']//button[@type='submit']")
    public WebElement go;

    public void selectMake(String carMake){

        Select makeDropDown = new Select(make);
        makeDropDown.selectByVisibleText(carMake);
    }

    public void selectModel(String carModel){
        Select selectModel = new Select(model);
        selectModel.selectByVisibleText(carModel);

    }

    @Override
    public void isCurrentPage() {
      assertEquals(driver.getTitle(),"New Cars for Sale - Pricing and Deals | Edmunds");
    }





}
