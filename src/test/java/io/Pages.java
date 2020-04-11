package io;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Pages {

    protected static WebDriver driver;

    public Pages() {
        PageFactory.initElements(driver, this);
    }

    public static void setDriver(WebDriver driver) {
        Pages.driver = driver;
    }

    public static void closeBrowser() {
        if (null != Pages.driver) {
            Pages.driver.close();
        }
    }
}
