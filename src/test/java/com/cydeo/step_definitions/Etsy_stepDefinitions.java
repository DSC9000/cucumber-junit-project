package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Etsy_stepDefinitions {
    @Given("user is on Etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        BrowserUtils.verifyTitle(expectedTitle);
    }

    EtsyHomePage etsy = new EtsyHomePage();

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsy.searchBox.sendKeys("Wooden Spoon");
    }

    @And("user click the Etsy search button")
    public void userClickTheEtsySearchButton() {
        etsy.searchButton.click();
    }

    @Then("user sees Wooden Spoon int the title")
    public void user_sees_wooden_spoon_int_the_title() {

        BrowserUtils.verifyTitle("Wooden spoon - Etsy");
    }


    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String keyword) {
        etsy.searchBox.sendKeys(keyword);
    }



    @Then("user sees {string} in the title")
    public void userSeesInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }
}