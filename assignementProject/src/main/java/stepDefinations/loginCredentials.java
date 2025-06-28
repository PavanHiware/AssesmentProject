package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.testcontextSetup;

public class loginCredentials {
	testcontextSetup testcontextSetup;

	public loginCredentials(testcontextSetup testcontextSetup) {
		this.testcontextSetup = testcontextSetup;
	}

	@Given("user should open given URL")
	public void user_should_open_given_url() throws IOException {
		testcontextSetup.aboutBrowser.openBrowser();
	}

	@Given("validate the login page")
	public void validate_the_login_page() {
		testcontextSetup.loginPage.getTitle();

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		testcontextSetup.loginPage.username().sendKeys(username);
		testcontextSetup.loginPage.password().sendKeys(password);
		testcontextSetup.commonUtils.captureScreenshot("LoginCreds");
	}

	@When("cliks on login button")
	public void cliks_on_login_button() {
		testcontextSetup.loginPage.signin().click();
	}

	@Then("validate the user credentials")
	public void validate_the_user_credentials() {
		
	}

	@Then("validate error message")
	public void validate_error_message() {
		testcontextSetup.loginPage.captureErrorMeaasge();
		testcontextSetup.commonUtils.captureScreenshot("errorMessage");
		testcontextSetup.aboutBrowser.teardown();
	}

}
