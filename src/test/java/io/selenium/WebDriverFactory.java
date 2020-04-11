package io.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {

    public static WebDriver getDriver(Browser browser) {
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(browser.setDriver());
        return eventFiringWebDriver.register(new EventHandler());
    }

    public enum Browser {
        CHROME {
            @Override
            public WebDriver setDriver() {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                return driver;
            }
        },
        FIREFOX {
            @Override
            public WebDriver setDriver() {
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver =  new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;
            }
        };

        public abstract WebDriver setDriver();
    }
}