package com.cybertek.tests.day16_download_uploaded_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtil;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends TestBase{


    @Test
    public void fileDownloadTest(){
        //Navigate to download page. Reading from url properties
        driver.get("http://practice.cybertekschool.com/download");

       //locate and click on some-file.text to download
       driver.findElement(By.linkText("some-file.txt")).click();
        BrowserUtil.sleep(2);
        //verify that file is download folder

        String file = System.getProperty("user.home") + "/Downloads/some-file.txt";
        System.out.println(file);

        File file1 = new File(file);
        System.out.println(file1.exists());

        Assert.assertTrue(file1.exists(),"Download failed!");


        //delete after verification



      }






}
