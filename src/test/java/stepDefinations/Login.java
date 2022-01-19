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

    @When("^user login into applciation using username and password$")
    public void user_login_into_applciation_using_username_and_password() throws Throwable {
    	System.out.println("coming to login 2");
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("coming to login 3");
    }

    @And("cards are displayed")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("coming to login 4");
    }

}
