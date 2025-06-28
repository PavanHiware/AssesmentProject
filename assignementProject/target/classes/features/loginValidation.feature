Feature: Login functionality

@login
Scenario: Invalid Login Validation

Given user should open given URL
And validate the login page
When user enters "7218688193" and "Pavan" 
And cliks on login button 
Then validate the user credentials
And validate error message
