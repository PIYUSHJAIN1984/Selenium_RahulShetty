package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class stepDefination extends base {
	@Given("Initialize driver with chrome browser")
	public void initialize_driver_with_chrome_browser() throws IOException {
		driver = initializeDriver();
	}

	@Given("navigate to {string} site")
	public void navigate_to_site(String string) {
		driver.get(string);
	}

	@Given("click on Login link in Home page to landIn SignIn Page")
	public void click_on_login_link_in_home_page_to_land_in_sign_in_page() {
		LandingPage l = new LandingPage(driver);
		LoginPage lp = l.getLogin();
	}

	 @When("^userName enters (.+) and (.+) and logs in$")
	    public void username_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLoginBtn().click();
	}

	@Then("verify user is successfully logged in")
	public void verify_user_is_successfully_logged_in() {
		PortalHomePage ph = new PortalHomePage(driver);
		Assert.assertTrue(ph.getSearchBox().isDisplayed());
	}
	
	@And("close the browser")
	public void close_browser() {
		driver.quit();
	}
}
