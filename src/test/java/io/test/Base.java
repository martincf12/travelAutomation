package io.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.Pages;
import io.selenium.WebDriverFactory;
import io.selenium.WebDriverFactory.Browser;

public class Base {

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional(value = "CHROME") String browser){
        WebDriver driver = WebDriverFactory.getDriver(Browser.valueOf(browser));
        Pages.setDriver(driver);
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        Pages.closeBrowser();
    }
}