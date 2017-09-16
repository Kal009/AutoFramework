package com.Bframework.Newspage;

import com.Bframework.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class News_page extends Basepage {
    WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using = "News")
    WebElement news_link;

    @FindBy(how = How.CLASS_NAME,using = "nw-o-link")
    WebElement Internationalnews_link;

    @FindBy(how = How.LINK_TEXT,using = "World")
    WebElement world_news;

    public News_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    public void newslink(){
        news_link.click();

    }

    public void internationalnews(){
        Internationalnews_link.click();

    }

    public void worldnews(){
        assertTrue(world_news.getText().matches("World"));
    }

}
