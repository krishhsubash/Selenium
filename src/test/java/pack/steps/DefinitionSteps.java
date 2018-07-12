package pack.steps;

import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pack.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.is_the_home_page();
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }

    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        anna.should_see_definition(definition);
    }

    @Given("^I launch base URI for Rest Assured testing$")
    public void iLaunchBaseURIForRestAssuredTesting() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anna.launchBaseURL();
    }

    @When("^I enter parameters for Rest Assured$")
    public void iEnterParametersForRestAssured() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anna.enterParameters();
    }

    @Then("^I verify the status code response$")
    public void iVerifyTheStatusCodeResponse() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anna.verifyStatusCode();
    }
}
