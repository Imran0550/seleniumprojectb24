package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.BookManagementPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryLoginPOMTest extends TestBase {


    @Test
    public void invalidCredentialsTest(){
        driver.get(ConfigurationReader.getProperty("library"));

        LibraryLoginPage login = new LibraryLoginPage();
        login.email.sendKeys("invalid_email@gmail.com");
        login.password.sendKeys("dhajks");
        login.signInBtn.click();
        System.out.println(login.errorMsg.getText());

        Assert.assertTrue(login.errorMsg.isDisplayed());
    }

    @Test
    public void validCredentialTest(){
        driver.get(ConfigurationReader.getProperty("library"));
        libraryLoginPage.email.sendKeys(ConfigurationReader.getProperty("email"));
        libraryLoginPage.password.sendKeys(ConfigurationReader.getProperty("pass"));
        libraryLoginPage.signInBtn.click();
    }

    @Test
    public void verifyLoggedInTest(){

        BookManagementPage managementPage = new BookManagementPage();
        System.out.println(managementPage.VerifyLoggedIn.getText());
        managementPage.isCurrentPage();
        Assert.assertTrue(managementPage.VerifyLoggedIn.isDisplayed());
    }
}
