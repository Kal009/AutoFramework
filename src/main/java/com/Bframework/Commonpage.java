package com.Bframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class Commonpage extends Basepage{


    public Commonpage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }


    public void teardown(){
    driver.quit();
}

}
