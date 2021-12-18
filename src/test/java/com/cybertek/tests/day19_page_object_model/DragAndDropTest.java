package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.tests.day18_actions_pom_intro.actionsDemoTest;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.image.Kernel;

public class DragAndDropTest extends TestBase {

    @Test
    public void guru99DragAndDropTest(){
        driver.get(ConfigurationReader.getProperty("dragadndrop.url"));
        WebElement bank = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
        WebElement target = driver.findElement(By.cssSelector("#bank"));

        actions.dragAndDrop(bank,target).perform();

        WebElement fiveK = driver.findElement(By.linkText("5000"));
        actions.dragAndDropBy(fiveK,768,352).perform();

    }

    @Test
    public void carGurusPriceSliderTest(){
        driver.get(ConfigurationReader.getProperty("cargurus.url")+"/Cars/inventorylisting/viewDetailsFilterViewInventoryListing.action?sourceContext=carGurusHomePageModel&entitySelectingHelper.selectedEntity=d177&zip=22102");

        WebElement priceSlider = driver.findElement(By.xpath("(//button[@aria-valuemin='3000'])[1]"));
        int x = priceSlider.getLocation().getX();
        int y = priceSlider.getLocation().getY();
        System.out.println("x = " + x);
        System.out.println("y = " + y);

       actions.dragAndDropBy(priceSlider,100,0).perform();



    }
}
