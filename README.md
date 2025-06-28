🧪 Automation Framework: Login, Forgot Password & Performance Testing
📌** Project Overview**
This project implements a Behavior-Driven Development (BDD) framework using Cucumber, Selenium WebDriver, Java, and TestNG. It automates the following functionalities:

Login: Validates user authentication.

Forgot Password: Tests the password recovery process.

Performance Testing: Measures page load times and response metrics.

Reporting: Generates detailed XML and HTML reports.

Screenshots: Captures screenshots on test failure for better debugging.# AssesmentProject
Developed a Java BDD automation framework using Cucumber, Selenium WebDriver, and TestNG. It automates login and forgot‑password flows, captures key performance metrics, employs Page Object Model, supports parallel execution, and generates HTML/JSON reports—ensuring robust, maintainable, CI‑ready functional testing. 
🛠️ Technologies Used
Selenium WebDriver: Browser automation.

Java: Programming language.

Cucumber: BDD framework for writing test scenarios.

TestNG: Test configuration and execution.

ExtentReports: For generating rich HTML reports.

Maven: Dependency management and build automation.

📁 Project Structure
pgsql
Copy
Edit
├── src/
│   ├── main/
│   │   └── java/
│   │       └── steps/
│   │           ├── LoginSteps.java
│   │           ├── ForgotPasswordSteps.java
│   │           └── PerformanceSteps.java
│   └── test/
│       └── resources/
│           └── features/
│               ├── login.feature
│               └── forgotPassword.feature
├── pom.xml
├── test-output/
│   ├── emailable-report.html
│   └── testng-results.xml
└── screenshots/
⚙️ Setup and Execution
Prerequisites
Java 11+

Maven

IDE: IntelliJ IDEA, Eclipse, or VS Code

WebDriver: ChromeDriver or GeckoDriver (based on your browser)

Installation
Clone the repository:

bash
Copy
Edit
git clone https://github.com/yourusername/automation-framework.git
cd automation-framework
Install dependencies:

bash
Copy
Edit
mvn clean install
Running Tests
To execute the tests:

bash
Copy
Edit
mvn test
This command runs the Cucumber feature files with TestNG, generating reports in the test-output/ directory.

📝 Sample Feature File: login.feature
gherkin
Copy
Edit
Feature: User Login

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters username "testuser" and password "password123"
    Then User should be redirected to the dashboard
🧪 Sample Step Definition: LoginSteps.java
java
Copy
Edit
@Given("User is on the login page")
public void userIsOnLoginPage() {
    driver.get("https://example.com/login");
}

@When("User enters username {string} and password {string}")
public void userEntersCredentials(String username, String password) {
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.id("loginButton")).click();
}

@Then("User should be redirected to the dashboard")
public void userIsRedirectedToDashboard() {
    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
}
📊 Reporting
TestNG Reports: After test execution, open test-output/emailable-report.html in a browser to view the test results.

ExtentReports: Configured to capture screenshots on test failure and generate detailed HTML reports. Ensure the extent.properties file is properly configured to specify the screenshot directory.

📸 Screenshots on Failure
Screenshots are captured on test failure and stored in the screenshots/ directory. This helps in debugging and provides visual evidence of test failures.
