package com.cybertek.tests.day16_download_uploaded_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FileUploadTest extends TestBase {

    @Test
    public void fileUploadTest(){


        driver.get(ConfigurationReader.getProperty("cydeo"));

        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys(System.getProperty("user.home") + "/Downloads/some-file.txt");

        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();

        /**
         verify file is uploaded. check filename is displayed on page
         */

        String uploaded = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(uploaded,"File Uploaded!");

        WebElement confirmUpload = driver.findElement(By.xpath("//div[@id='uploaded-files']"));

        Assert.assertTrue(confirmUpload.isDisplayed());

    }



}
