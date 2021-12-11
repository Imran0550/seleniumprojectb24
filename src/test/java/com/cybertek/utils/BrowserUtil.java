package com.cybertek.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserUtil {


    /**
     * this method is used tp pause the code for given seconds
     * It is static method so we can call:
     * BrowserUtils.sleep(5)
     * @param second
     */

    public static void sleep(int second){

        try {


            Thread.sleep(second * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }

    public static void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,"+pixels+")");



    }

    public static void scrollDownElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }
}
