package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.DashBoardPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PageNavigationStepDefs  {
    DashBoardPage dashBoardPage=new DashBoardPage();

    @When("I click on {string} link")
    public void i_click_on_link(String link) {
        // Write code here that turns the phrase above into concrete actions
        switch(link.toLowerCase()){
            case "dashboard":
                dashBoardPage.dashboard.click();
                break;
            case "users":
                dashBoardPage.usersButton.click();
                break;
            case "books":
                dashBoardPage.books.click();
                break;

        }

    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String page) {
        //verify title
        BrowserUtils.wait(3);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(page.toLowerCase()));

        switch(page.toLowerCase()){
            case "users":
                String actual=dashBoardPage.pageHeader.getText();
                Assert.assertEquals("User Management",actual);
                break;
            case "books":
                String actual2=dashBoardPage.pageHeader.getText();
                Assert.assertEquals("Book Management",actual2);
                break;


        }
    }
}
