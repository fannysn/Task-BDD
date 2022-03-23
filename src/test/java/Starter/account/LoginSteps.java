package Starter.account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am at login page")
    public void iAmAtLoginPage() {
        System.out.println("I am the login page");
    }

    @When("I fill valid username or phone and password")
    public void iFillValidUsernameOrPhoneAndPassword() {
        System.out.println("username/phone");
        System.out.println("Password");
    }

    @And("click sign in button")
    public void clickSignInButton() {
        System.out.println("");
    }

    @Then("I successfully login to homepage")
    public void iSuccessfullyLoginToHomepage() {
        System.out.println("");
    }

    @When("I fill invalid username or phone and valid password")
    public void iFillInvalidUsernameOrPhoneAndValidPassword() {
        System.out.println("invalid username");
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        System.out.println("error message");
    }

    @When("I fill valid username or phone and invalid password")
    public void iFillValidUsernameOrPhoneAndInvalidPassword() {
        System.out.println("invalid password");
    }

    @When("I fill invalid username or phone and invalid password")
    public void iFillInvalidUsernameOrPhoneAndInvalidPassword() {
        System.out.println("invalid username/phone");
        System.out.println("invalid password");
    }
}
