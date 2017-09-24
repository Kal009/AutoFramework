package com.Bframework.Homepage;

import com.Bframework.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class Home_page extends Basepage {
    WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using = "Homepage")
    WebElement homepagelink;

    @FindBy(how = How.ID,using = "idcta-link")
    WebElement loginpagelink;

    @FindBy(how = How.LINK_TEXT,using = "Weather")
    WebElement TVpagelink;

    public Home_page(WebDriver driver){
            this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void homepage(){
        homepagelink.click();

    }

    public void loginpagelink(){
        loginpagelink.click();
        System.out.println("loginpagelink");

    }
}
