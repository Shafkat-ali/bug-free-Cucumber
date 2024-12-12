package stepDefinitions;


import Utilities.BaseClass;
import Utilities.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.openqa.selenium.devtools.v85.page.Page;
import pages.loginPage;

public class loginStepDef extends PageInitializer {


    @Given("^the user navigate to the url$")
    public void the_user_navigate_to_the_url() throws Throwable {
    	BaseClass.getDriver();
    }

    @When("^the user enters the correct username and password$")
    public void the_user_enters_the_correct_username_and_password() throws Throwable {
        lp.usernameField.sendKeys("Admin");
        lp.passwordField.sendKeys("admin123");
    }

    @When("^the user clicks on the login button$")
    public void the_user_clicks_on_the_login_button() throws Throwable {
        lp.loginButton.click();
     }

    @Then("^the user is redirected to the homepage$")
    public void the_user_is_redirected_to_the_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^a welcome message is displayed$")
    public void a_welcome_message_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("the user enters the incorrect {string} and correct {string}")
    public void the_user_enters_the_incorrect_and_correct(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("an error message pops up")
    public void an_error_message_pops_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
