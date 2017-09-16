package com.Bframework.Loginpage;

import com.Bframework.BaseSteps;
import com.Bframework.Commonpage;
import com.Bframework.Homepage.Home_page;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static alpha.BrowserFactory.driver;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class LoginpageSteps extends BaseSteps {

    Commonpage cp;
    Home_page hp;
    Login_page lp = new Login_page(driver);

    public LoginpageSteps() throws IOException {
    }

    @After("@Krishna")
    public void teardown(){
        driver.quit();

    }

    @Given("^user is in home page$")
    public void userIsInHomePage() throws Throwable {
        hp =new Home_page(driver);
        hp.homepage();
        System.out.println("start");
    }


    @When("^user click on login page$")
    public void userClickOnLoginPage() throws Throwable {
        Home_page hp = new Home_page(driver);
        hp.loginpagelink();
    }


    @Then("^user can see the sign in page$")
    public void userCanSeeTheSignInPage() throws Throwable {
        Login_page lp = new Login_page(driver);
        lp.resterlink();
    }
   // @When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\" and receive error \"([^\"]*)\"$")
    public void userEnterUsernameAndPasswordAndReceiveError(String arg0, String arg1, String arg2) throws Throwable {
        lp.loginpage(arg0, arg1);

    }
     @When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEnterUsernameAndPassword(String arg0, String arg1) throws Throwable {
        lp.loginpage(arg0, arg1);
    }

    @And("^user click on singin botton$")
    public void userClickOnSinginBotton() throws Throwable {
        Login_page lp = new Login_page(driver);
        lp.siginbotton();
    }

  //  @Then("^user should be in logged in page$")
    public void userShouldBeInLoggedInPage() throws Throwable {
        lp.errormassage();

    }
    @Then("^user should can see error message \"([^\"]*)\"$")
    public void userShouldCanSeeErrorMessage(String arg0) throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='password']/div[2]")).getText().matches(arg0));
    }

    @And("^tear down browser$")
    public void tearDownBrowser() throws Throwable {
        cp = new Commonpage(driver);
        cp.teardown();
    }



}
