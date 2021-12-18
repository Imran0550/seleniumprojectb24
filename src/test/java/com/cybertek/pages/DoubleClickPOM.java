package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.swing.*;

public class DoubleClickPOM {

    public DoubleClickPOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // constructor

    @FindBy(xpath = "//iframe[@id='iframeResult']") public WebElement iframe;
    @FindBy(xpath = "//p[@id='demo']") public WebElement text;

    public void switchToIframe(WebElement element){
        Driver.getDriver().switchTo().frame(element);
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(text).perform();
    }

}
