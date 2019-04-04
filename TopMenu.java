package se.iths.selenium.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopMenu {

    WebDriver driver;

    By proceedToCheckOutLinkIdentifier = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");

    public TopMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void allClickFunctionalities() {



        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("Printed Chiffon Dress");

        WebElement clickSearchButton = driver.findElement(By.name("submit_search"));
        clickSearchButton.click();

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
        addToCart.click();

        ExpectedCondition proceedToCheckOutIsClickable = ExpectedConditions.elementToBeClickable(proceedToCheckOutLinkIdentifier);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(proceedToCheckOutIsClickable);


        WebElement proceedToCheckOut = driver.findElement(proceedToCheckOutLinkIdentifier);
        proceedToCheckOut.click();

        WebElement proceedCheckOutContinue = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
        proceedCheckOutContinue.click();

        WebElement emailSearchBox = driver.findElement(By.name("email"));
        emailSearchBox.click();
        emailSearchBox.sendKeys("slask@apa.se");
        WebElement passwordSearchBox = driver.findElement(By.name("passwd"));
        passwordSearchBox.sendKeys("slask");

        WebElement clickSignIn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
        clickSignIn.click();

        WebElement proceedFurther = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
        proceedFurther.click();

        WebElement clickTermOfService = driver.findElement(By.id("cgv"));
        clickTermOfService.click();
        WebElement proceedToShipping  = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
        proceedToShipping.click();

        WebElement payByBankWire = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
        payByBankWire.click();

        WebElement confirmOrder = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
        confirmOrder.click();

    }
    public String confirmTest() {

        WebElement confirmTest = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
        return confirmTest.getText();
    }

    public void allClickFunctionalitiesWithOutTermsOfService(){

            WebElement searchBox = driver.findElement(By.id("search_query_top"));
            searchBox.sendKeys("Printed Chiffon Dress");

            WebElement clickSearchButton = driver.findElement(By.name("submit_search"));
            clickSearchButton.click();

            WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
            addToCart.click();

            ExpectedCondition proceedToCheckOutIsClickable = ExpectedConditions.elementToBeClickable(proceedToCheckOutLinkIdentifier);
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(proceedToCheckOutIsClickable);


            WebElement proceedToCheckOut = driver.findElement(proceedToCheckOutLinkIdentifier);
            proceedToCheckOut.click();

            WebElement proceedCheckOutContinue = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
            proceedCheckOutContinue.click();

            WebElement emailSearchBox = driver.findElement(By.name("email"));
            emailSearchBox.click();
            emailSearchBox.sendKeys("slask@apa.se");
            WebElement passwordSearchBox = driver.findElement(By.name("passwd"));
            passwordSearchBox.sendKeys("slask");

            WebElement clickSignIn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
            clickSignIn.click();

            WebElement proceedFurther = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
            proceedFurther.click();

            WebElement proceedToShipping  = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
            proceedToShipping.click();

        }

        public String ConfirmTest2(){
        WebElement confirmTest2 = driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/div/div/p"));
        return confirmTest2.getText();
        }
    }




