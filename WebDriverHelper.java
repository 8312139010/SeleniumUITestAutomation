package se.iths.selenium.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {

    //This will help if we have many test classes and want to change the browser settings
    //in all at once, then we can call this method in respective class.

    public static WebDriver createWebDriver(){
        return new ChromeDriver();
    }

}
