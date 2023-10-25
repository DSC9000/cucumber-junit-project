package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setupMethod(){

    }
    @After
    public void tearDown(Scenario scenario){
        byte [] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());
        Driver.closeDriver();

    }
}
