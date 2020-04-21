package com.cybertek.library.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    //we wrote a test scenario first in cukesrunnes class, but it wants us steps
    //so we pasted info here from cukesrunner class terminal
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Going to login page");
    }

    @When("I login as admin user")
    public void i_login_as_admin_user() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logging in as a librarian");
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verifying dashboard page");
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logging as a student");
    }
}
