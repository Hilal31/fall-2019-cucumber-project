package com.cybertek.library.step_definitions;

import com.cybertek.library.utilities.Driver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUpScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }
    @After
    public void tearDownScenario(){
        Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("prints before each step");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("prints after each step");
    }
}
