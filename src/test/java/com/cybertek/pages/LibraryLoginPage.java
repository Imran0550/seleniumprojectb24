package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LibraryLoginPage {


   public LibraryLoginPage(){
      //Selenium command to initialize the elements below
      PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(id = "inputEmail")
   public WebElement email;

   @FindBy(id = "inputPassword")
   public WebElement password;

   @FindBy(xpath = "//button[@type = 'submit']")
   public WebElement signInBtn;

   @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
   public WebElement errorMsg;



}
