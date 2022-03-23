package Starter.Jobs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobSteps {
    @Given("I am in Jobs page")
    public void iAmInJobsPage() {
        System.out.println("I am in Jobs page");
    }

    @When("I want more recommendation job for me results")
    public void iWantMoreRecommendationJobForMeResults() {
        System.out.println("more result");
    }

    @And("click button search jobs")
    public void clickButtonSearchJobs() {
        System.out.println("");
    }

    @Then("I can find all the result recommended jobs for me")
    public void iCanFindAllTheResultRecommendedJobsForMe() {
        System.out.println("");
    }

    @Given("I am in JobsSearch page")
    public void iAmInJobsSearchPage() {
        System.out.println("I am in JobsSearch page");
    }

    @When("I want find recommendation jobs by input keyword skill")
    public void iWantFindRecommendationJobsByInputKeywordSkill() {
        System.out.println("keyword.skill");
    }

    @Then("I can find the result recommendation jobs")
    public void iCanFindTheResultRecommendationJobs() {
        System.out.println("");
    }

    @When("I want find recommendation jobs by input keyword location")
    public void iWantFindRecommendationJobsByInputKeywordLocation() {
        System.out.println("keyword.location");
    }

    @Then("I can find the result recommendation jobs according the location")
    public void iCanFindTheResultRecommendationJobsAccordingTheLocation() {
        System.out.println("");
    }



}
