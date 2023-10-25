package com.cydeo.step_definitions;

import com.cydeo.pages.Wiki_search_page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Wiki_step_defs {
    Wiki_search_page wikiSearchPage = new Wiki_search_page();


    @Given("user is on the wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types {string} in the wikipedia search box")
    public void user_types_in_the_wikipedia_search_box(String keyWord) {
      wikiSearchPage.searchBox.sendKeys(keyWord + Keys.ENTER);
    }

    @Then("user should see {string} in the wiki  title")
    public void user_should_see_in_the_wiki_title(String expectedTitle) {

        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}