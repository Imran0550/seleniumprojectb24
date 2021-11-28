package com.cybertek.tests.day09_testng_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntro {

    //   testng  --> test bew generation. Similar to JUnit

    //testing framework, that helps us write TEST Codes.
    //TEST code can be unit test -> testing java classes, java methods etc
    // TEST can be Selenium, API, Database automation code.

    String url = "https://www.etsy.com";

    @BeforeClass // this will run before anything in this class
    public void setUp(){
        System.out.println("@BeforeClass setUp method ....");
        System.out.println("Opened browser and Navigating to + " + url);
        System.out.println("===========================================");
    }

    @BeforeMethod // this will run before each test
    public void setUpApp(){
        System.out.println("@BeforeMethod setUpApp method is running....");
        System.out.println("Navigating to "+ url);
        System.out.println("==================================");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("Running test 1...");
        int num =10;
        Assert.assertEquals(10,num);
    }

    @Test(priority = 2)
    public void myTest2(){
        System.out.println("Running Test ");
        String name = "Bob";

        Assert.assertTrue(name.contains("B"));
    }

    @AfterMethod // this will run after each test
    public void tearDown(){
        System.out.println("@AfterMethod is setup and Running");
        System.out.println("Navigating to " + url);
        System.out.println("=================================");
    }

    @AfterClass
    public void afterAll(){
        System.out.println("@afterClass method is set up and running");
        System.out.println("Navigating to " + url);
        System.out.println("========================================");
    }

}
