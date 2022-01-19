package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login {

    @Given("^user is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("coming to login 1");
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("coming to login 3");
    }

    @And("cards are displayed")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("coming to login 4");
    }
    
    @When("user login into applciation using {string} and {string}")
    public void user_login_into_applciation_using_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("coming to login 5");
    }
    @Then("users name is displayed at the top right")
    public void users_name_is_displayed_at_the_top_right() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("coming to login 6");
    }
    
    @Then("users picture is displayed")
    public void users_picture_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("users picture is displayed");
    }

    @Then("a new code is added by user Y")
    public void a_new_code_is_added_by_user_y() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
