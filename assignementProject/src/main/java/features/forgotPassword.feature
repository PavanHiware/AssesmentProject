Feature: Login functionality


@forgotPassword
Scenario: Forgot Password Flow

Given user should open given URL link
When user clicks on forgot password
And user enter "7218688193"
And click on send button
Then validate message on screen
