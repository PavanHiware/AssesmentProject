package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.testcontextSetup;

public class loginPage {
	 testcontextSetup testcontextSetup;
	
	public loginPage(testcontextSetup testcontextSetup) {
		this.testcontextSetup =testcontextSetup;
	}

@Given("User is on given URL")
public void user_is_on_given_url() throws IOException {
	testcontextSetup.aboutBrowser.openBrowser();
    
}
@Given("Start timer after initial page load")
public void start_timer_after_initial_page_load() {
	testcontextSetup.commonUtils.startTime();
    
}
@When("Wait for visibility of element")
public void wait_for_visibility_of_element() {
	testcontextSetup.loginPage.username().isDisplayed();
    testcontextSetup.loginPage.password().isDisplayed();
    testcontextSetup.loginPage.signin().isDisplayed();
}
@When("Stop timer once elements are visiable")
public void stop_timer_once_elements_are_visiable() {
	testcontextSetup.commonUtils.currentTime();
    
}
@Then("Log total time taken")
public void log_total_time_taken() {
	testcontextSetup.commonUtils.totalTime();
	testcontextSetup.commonUtils.captureScreenshot("performancePage");
   testcontextSetup.aboutBrowser.teardown();
}
}
