package com.Bframework.Loginpage;

import com.Bframework.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.assertTrue;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class Login_page extends Basepage {
WebDriver driver;

@AfterClass
public void teardown(){
    driver.quit();
}

  @FindBy(how = How.CLASS_NAME,using = "field__input")
  WebElement user_link;

    @FindBy(how = How.LINK_TEXT,using = "Register now")
    WebElement regiternowlink;

    @FindBy(how = How.ID,using = "password-input")
    WebElement password_link;

    @FindBy(how = How.ID,using = "submit-button")
    WebElement singinBotton;

    @FindBy(how = How.ID,using = "form-error-password")
    WebElement warring_massage;

    @FindBy(how = How.CSS,using = "#form-error-username>span")
    WebElement username_error;

   public Login_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

   public void resterlink(){
       assertTrue(regiternowlink.getText().matches("Register now"));

   }
    public void siginbotton(){
       singinBotton.click();
    }
    public void errormassage(){
      // Assert.assertTrue((warring_massage.getText().matches("Uh oh, that password doesn’t match that account. Please try again."))|| warring_massage.getText().matches("Something's missing"));
   //(username_error.getText().contains("Sorry"))

    }

    public void loginpage(String arg0, String arg1) {
        user_link.sendKeys(arg0);
        password_link.sendKeys(arg1);
    }
}
