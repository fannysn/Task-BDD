package Starter.account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyNetworkSteps {
    @Given("I am at MyNetwork page")
    public void iAmAtMyNetworkPage() {
        System.out.println("I am at MyNetwork page");
    }

    @When("I find a friend invitations from someone")
    public void iFindAFriendInvitationsFromSomeone() {
        System.out.println("");
    }

    @And("click accept button")
    public void clickAcceptButton() {
        System.out.println("");
    }

    @Then("I got new connections")
    public void iGotNewConnections() {
        System.out.println("connection");
    }

    @And("click ignore button")
    public void clickIgnoreButton() {
        System.out.println("");
    }

    @Then("I success canceled the invitations")
    public void iSuccessCanceledTheInvitations() {
        System.out.println("canceled");
    }

    @When("I scrolling down this page")
    public void iScrollingDownThisPage() {
        System.out.println("");
    }

    @And("click connect button")
    public void clickConnectButton() {
        System.out.println("");
    }

    @And("click follow button")
    public void clickFollowButton() {
        System.out.println("");
    }

    @Then("I can see status pending the connection")
    public void iCanSeeStatusPendingTheConnection() {
        System.out.println("status.pending");
    }

    @Then("I can see status following the connection")
    public void iCanSeeStatusFollowingTheConnection() {
        System.out.println("status.following");
    }
}
