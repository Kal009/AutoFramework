package com.Bframework;

import alpha.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class BaseSteps {

  public WebDriver driver = BrowserFactory.getbrowser();

  public BaseSteps() throws IOException {
  }
}
