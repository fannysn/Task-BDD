package Starter.people;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
    @Given("I am in Homepage")
    public void iAmInHomepage() {
        System.out.println("I am in Homepage");
    }

    @When("I type valid keywords job positions")
    public void iTypeValidKeywordsJobPositions() {
        System.out.println("keywords");
    }

    @And("click icon search")
    public void clickIconSearch() {
        System.out.println("");
    }

    @Then("I can find all the result hiring job that i wont")
    public void iCanFindAllTheResultHiringJobThatIWont() {
        System.out.println("");
    }

    @When("I choose one of the keyword suggestions")
    public void iChooseOneOfTheKeywordSuggestions() {
        System.out.println("keywords");
    }

    @Then("I can find all the result that i wont")
    public void iCanFindAllTheResultThatIWont() {
        System.out.println("");
    }

    @When("I type Invalid keywords")
    public void iTypeInvalidKeywords() {
        System.out.println("invalid keywords");
    }

    @Then("I can't see the result")
    public void iCanTSeeTheResult() {
        System.out.println("");
    }
}
