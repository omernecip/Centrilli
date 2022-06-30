package com.centrilli.stepDefinitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utility.ConfigurationReader;
import com.centrilli.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @When("User goes to Centrilli page")
    public void user_goes_to_centrilli_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user  enters valid {string}")
    public void user_enters_valid(String string) {

        loginPage.usernameinput.sendKeys(string);

    }
    @Then("user enters {string}")
    public void user_enters_password(String string) {

        loginPage.passwordinput.sendKeys(string);
    }
    @Then("user clicks the login button")
    public void user_clicks_the_login_button() {

        loginPage.cilickButton.click();
    }
    @Then("user should see the homepage")
    public void user_should_see_the_homepage() {


    }



}
