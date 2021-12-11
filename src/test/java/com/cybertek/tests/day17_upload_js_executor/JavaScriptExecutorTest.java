package com.cybertek.tests.day17_upload_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends TestBase {


    @Test
    public void alertExampleTest(){
        //down casting from WebDriver to JavaScriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //running javascript alert command
        js.executeScript("alert('hello hello')");

        BrowserUtil.sleep(2);

        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText = " + alert.getText());
        alert.accept();


    }
    @Test
    public void ScrollTest(){

        driver.get(ConfigurationReader.getProperty("scroll.url"));
        BrowserUtil.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 5000)");

//        for(int i=0;i<10;i++){
//            BrowserUtil.sleep(2);
//            js.executeScript("window.scrollBy(0, 5000)");
//        }
    }
    @Test(priority = 3)
    public void locateModelY(){

        driver.get("https://www.tesla.com");

        WebElement modelY = driver.findElement(By.xpath("(//h1[.='Model 3'])[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)", modelY);

        WebElement shopNow = driver.findElement(By.xpath("//a[@title='Shop Now']"));
        js.executeScript("arguments[0].scrollIntoView(true)" , shopNow);

        BrowserUtil.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", shopNow);

    }
    @Test
    public void sendKeysWithJS(){

        driver.get(ConfigurationReader.getProperty("facebook"));

        //how to write in input box without using sendKeys
        //locate the field

        WebElement name = driver.findElement(By.name("email"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].value='hello@gmail.com'",name);

    }
}
