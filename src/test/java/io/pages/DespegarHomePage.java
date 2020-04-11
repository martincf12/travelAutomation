package io.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.Pages;

public class DespegarHomePage extends Pages{
    //

        @FindBy(xpath = "/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a")
        private WebElement btnSeleccionVuelos;

        public DespegarHomePage() {
            super();
            driver.get("https://www.despegar.com.ar/");
        }

        public void cambiarVistaVuelos() {
            btnSeleccionVuelos.click();
        }
}
