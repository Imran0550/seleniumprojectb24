package com.cybertek.tests.MyPractice;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import com.cybertek.utils.LibraryUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LibrarySoftwareLinkVerification extends TestBase {

    @Test
    public void TC001(){

        LibraryUtilities.LoginToLibrary(driver);
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

    }


}
