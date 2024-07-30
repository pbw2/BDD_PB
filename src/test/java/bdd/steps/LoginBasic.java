package bdd.steps;

import io.cucumber.java.en.*;

public class LoginBasic {

    @Given("User is on landing page")
    public void user_is_on_landing_page() throws Exception {
        System.out.println("User is on landing page");
    }

    @When("User login into application with correct login and correct password")
    public void user_login_into_application_with_correct_login_and_correct_password() {
        System.out.println("User login into application with correct login and correct password");
    }

    @Then("Home page is visible")
    public void home_page_is_visible() throws Exception {
        System.out.println("Home page is visible");
    }

    @And("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
    }
}



