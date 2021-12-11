package com.cybertek.tests.day16_download_uploaded_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest2 extends TestBase {

    public void getLink(String str){
        driver.findElement(By.linkText(str)).click();
    }

    @Test
    public void fileTxtTest(){
        driver.get(ConfigurationReader.getProperty("cydeo"));

        getLink("file.txt");

        //verify that file is in your download folder
        String file = System.getProperty("user.home") + "/Downloads/file.txt";
        System.out.println(file);
        
        File file1 = new File(file);
        System.out.println("file1.exists() = " + file1.exists());

        //use assert true
        Assert.assertTrue(file1.exists(),"Download failed!");

        //after verification delete the file

        file1.delete();
    }
}
