package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Data_Tables_step_defs {
    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables.get(1));
    }

    @Given("user is on the dropdown page of practice tool")
    public void userIsOnTheDropdownPageOfPracticeTool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    DropdownPage dropDPage =new DropdownPage();
    @Then("user should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String>expectedMonths) {
        List<String>actMonths= BrowserUtils.dropdownOptions_as_String(dropDPage.monthDropdown);
        Assert.assertEquals(expectedMonths,actMonths);
    }
}
