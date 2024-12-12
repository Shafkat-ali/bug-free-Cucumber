package stepDefinitions;

import Utilities.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class accountsStepDef extends PageInitializer {

//helloWorld
@When("the user enters the incorrect username and correct password")
public void the_user_enters_the_incorrect_username_and_correct_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

    @Given("I query service by {string} and {string}")
    public void i_query_service_by_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I make the rest call")
    public void i_make_the_rest_call() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("response should contain {string} and {string}")
    public void response_should_contain_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("an error message pops up")
    public void an_error_message_pops_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters the incorrect {string} and correct {string}")
    public void the_user_enters_the_incorrect_and_correct(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
