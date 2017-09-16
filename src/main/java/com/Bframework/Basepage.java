package com.Bframework;

import alpha.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by Trupesh on 14/06/2017.
 */
public abstract class Basepage implements BBC_Interface  {
    public WebDriver driver;
   public void getbrowser() throws IOException {
        driver = BrowserFactory.getbrowser();

    }


}
