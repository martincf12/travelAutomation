package io.test;

import org.testng.annotations.Test;
import io.pages.DespegarHomePage;

public class BuscarVuelos extends Base  {

        @Test
        public void first(){
            DespegarHomePage despegarHomePage = new DespegarHomePage();
            despegarHomePage.cambiarVistaVuelos();
        }
}

