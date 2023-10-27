package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class Data_Tables_Pets_StepDef {
    @Then("user should see the pets we love")
    public void user_should_see_the_pets_we_love(List<String> petsWeLove) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("petsWeLove.get(1) = " + petsWeLove.get(1));
        System.out.println("petsWeLove = " + petsWeLove);
    }

    @Then("officer is able to see any data about driver")
    public void officerIsAbleToSeeAnyDataAboutDriver(Map<String,String>driverInfo) {
        System.out.println("driverInfo = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"address\") = " + driverInfo.get("address"));
        System.out.println("driverInfo = " + driverInfo.get("age"));
        System.out.println("driverInfo = " + driverInfo.get("surname"));
        System.out.println("driverInfo = " + driverInfo.get("state"));
        System.out.println("driverInfo = " + driverInfo.get("zipcode"));
        System.out.println("driverInfo.get(\"phone\") = " + driverInfo.get("phone"));
    }
}
