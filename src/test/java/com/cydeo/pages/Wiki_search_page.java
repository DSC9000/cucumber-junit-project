package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_search_page {
    public Wiki_search_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="searchInput")
    public WebElement searchBox;
}
