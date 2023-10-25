package com.cydeo.step_definitions;

import com.cydeo.pages.Bing_search_page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Bing_stepDefinitions {
    Bing_search_page bingSearchPage =new Bing_search_page();

    @Given("user is on Bing search page")
    public void user_is_on_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com");
    }
    @When("user enters orange in the Bing  search Box")
    public void user_enters_orange_in_the_bing_search_box() {
        bingSearchPage.searchBox.sendKeys("orange"+ Keys.ENTER);
    }
    @Then("user should see orange in the Bing  title")
    public void user_should_see_orange_in_the_bing_title() {
        BrowserUtils.verifyTitle("orange - Search");
    }

    @When("user enters {string} in the Bing  search Box")
    public void userEntersInTheBingSearchBox(String searchText) {
        bingSearchPage.searchBox.sendKeys(searchText +Keys.ENTER);
    }

    @Then("user should see {string} in the Bing  title")
    public void userShouldSeeInTheBingTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }
}
