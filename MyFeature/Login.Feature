Feature: my validations on mercury application
@Sanity
Scenario: user access to signup website
Given Mercury website is launched
And user clicks on sign up button
When user enters proper data
Then clicks on submit button for account creation
 @Regression
Scenario: user access to Login for registered Member
Given reigsitered user clicks on signIn link
Then he provides valid data for login input fields
And clicks on submit button for the login validation
@Smoke
Scenario: user access to Book Flight
Given user verifies the flights available
Then selects the desired flight
When user makes the payment
Then Tickets are generated