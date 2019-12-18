Feature: my validation on webdemoshop


Scenario: registration
Given webdemoshop website is launched
And user clicks on register button
When user entering proper data  
Then clicks on register button for account creation


Scenario: login
Given user clicks on login button
Then user enters the valid credentials
And user clicks on the login button


Scenario: Search items
Given user clicks on search box
Then user searches an item 
And clicks on the search button


Scenario: Add to cart
Given Searched item is displayed
And  user clicks on add to cart button

