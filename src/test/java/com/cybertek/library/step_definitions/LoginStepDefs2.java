package com.cybertek.library.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs2 {

    @When("I enter username {string}")
    public void i_enter_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username");
    }

    @When("I enter password {string}")
    public void i_enter_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicking on sign in");
    }


    @And("there should be {int} users")
    public void thereShouldBeUsers(int count) {
        System.out.println(count);
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {
        System.out.println("username:"+username+" password:"+password);
    }
    @Then("there should be {int} {string}")
    public void there_should_be(Integer int1, String string) {
        System.out.println("int1 count: "+int1+" String type: "+string);
    }
}
