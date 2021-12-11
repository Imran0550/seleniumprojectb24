package com.cybertek.tests.day17_upload_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99UploadTest extends TestBase {

    @Test
    public void UploadTest(){
        driver.get(ConfigurationReader.getProperty("guru99"));

        WebElement chooseFileElem = driver.findElement(By.cssSelector("#uploadfile_0"));
        WebElement term = driver.findElement(By.id("terms"));
        WebElement submitFileBtn = driver.findElement(By.id("submitbutton"));

       // chooseFileElem.sendKeys(System.getProperty("user.home")+"/Downloads/some-file.txt");
        term.click();
        submitFileBtn.click();

        //verify upload success by checking "1 file
        //has been successfully uploaded.message
        BrowserUtil.sleep(2);
        WebElement resultMsg = driver.findElement(By.id("res"));
        Assert.assertEquals(resultMsg.getText(),"1 file\nhas been successfully uploaded.");
    }

}

