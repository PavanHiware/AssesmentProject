package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.testcontextSetup;

public class passwordPage {
testcontextSetup testcontextSetup;
public passwordPage(testcontextSetup testcontextSetup) {
this.testcontextSetup=testcontextSetup; 
}

@Given("user should open given URL link")
public void user_should_open_given_url_link() throws IOException {
	testcontextSetup.aboutBrowser.openBrowser();
}
@When("user clicks on forgot password")
public void user_clicks_on_forgot_password() {
    testcontextSetup.loginPage.forgotPassword();
    testcontextSetup.commonUtils.captureScreenshot("forgotPassword");
}
@When("user enter {string}")
public void user_enter(String username) {
    testcontextSetup.forgotPasswordPage.username().sendKeys(username);
}
@When("click on send button")
public void click_on_send_button() {
   testcontextSetup.forgotPasswordPage.submit();
   testcontextSetup.commonUtils.captureScreenshot("ForgotUsername");
}
@Then("validate message on screen")
public void validate_message_on_screen() {
   testcontextSetup.forgotPasswordPage.errorMessage();
   testcontextSetup.commonUtils.captureScreenshot("errorMsgPassword");
   testcontextSetup.aboutBrowser.teardown();
}

}
