package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();

    //we wrote a test scenario first in cukesrunnes class, but it wants us steps
    //so we pasted info here from cukesrunner class terminal
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Going to login page");
        //to find a driver obj
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login as a librarian");
        String email=ConfigurationReader.getProperty("librarian_email");
        String password=ConfigurationReader.getProperty("librarian_password");
        loginPage.login(email,password);


    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verifying dashboard page");

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        String actualDashboard=Driver.getDriver().getCurrentUrl();
        System.out.println("Actual "+actualDashboard);



        Assert.assertTrue(actualDashboard.endsWith("dashboard"));
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login as a student");
    }
    @When("I login as an admin user")
    public void i_login_as_admin_user() {
        System.out.println("Login as admin");
    }



}
