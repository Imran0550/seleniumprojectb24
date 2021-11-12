package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_SmartBearLoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url= "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        String userName= "Tester";
        String password = "test";
driver.get(url);
        String expTitle = "Web Orders";
        String actTitle = driver.getTitle();

        if(driver.getTitle().equals("Web Orders")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

//        if(actTitle.equals(expTitle)){
//            System.out.println("Test passed");
//        }else {
//            System.out.println("Test failed");
//        }
        // enter username
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys(userName);
        Thread.sleep(2000);
        // enter password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(password);
        Thread.sleep(2000);

        if(driver.getTitle().equals("Web Orders")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_logout")).click();

        //click logout link
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);

        // quit browser
        driver.quit();



    }
}
