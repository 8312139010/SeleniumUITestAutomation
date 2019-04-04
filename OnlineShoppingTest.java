package se.iths.selenium.assignment2;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class OnlineShoppingTest {

    WebDriver chrome;

    By clickDressesLinkIdentifier = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    By clickSummerDressIdentifier = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a");
    By clickBlackColor = By.xpath("//*[@id=\"layered_id_attribute_group_11\"]");
    By clickMore = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span");
    By proceedToCheckOutLinkIdentifier = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span");


    @Before
    public void setUpBrowser(){
        chrome = WebDriverHelper.createWebDriver();
    }

    @After
    public void closeBrowser(){
        chrome.quit();
    }

    @Test
    public void ShoppingPrintedChiffonDress(){
        chrome.get("http://automationpractice.com/index.php");
        TopMenu topMenu = new TopMenu(chrome);
        topMenu.allClickFunctionalities();

        String confirm = topMenu.confirmTest();

        Assert.assertEquals(
                "Your order on My Store is complete.",
                confirm
        );
    }

    @Test
    public void ShoppingChiffonDressWithoutTermsOfService(){
        chrome.get("http://automationpractice.com/index.php");
        TopMenu topMenu = new TopMenu(chrome);
        topMenu.allClickFunctionalitiesWithOutTermsOfService();
        String confirm2 = topMenu.ConfirmTest2();

        Assert.assertEquals("You must agree to the terms of service before continuing.",
                confirm2);
    }

    // Johan i tried to make another test with selenide, but i had problem. I will discuss it with you in class.
    //So i commented it out.

    @Test
    public void ShoppingMoreSummerDress(){
        open("http://automationpractice.com/index.php");



        $(clickDressesLinkIdentifier).click();
        $(clickSummerDressIdentifier).click();
        chrome.manage().window().maximize();
        $(clickBlackColor).click();

        $(clickMore).click();




    }



}
