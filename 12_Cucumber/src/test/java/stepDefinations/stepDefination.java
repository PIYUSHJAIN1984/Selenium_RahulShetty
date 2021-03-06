package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("Login page");
	}

	@When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String s1, String s2) {
		System.out.println("login into application");
		System.out.println(s1 + " " + s2);

	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("Home page");
	}

	@Then("Cards are displayed are {string}")
	public void cards_are_displayed_are(String string) {
		System.out.println("Card displayed page "+string);
	}

}