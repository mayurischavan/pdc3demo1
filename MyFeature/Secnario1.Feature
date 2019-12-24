Feature: Case Study Scenario 1

Background: Utility
Given Browser and correct url is loaded


  Scenario Outline: validation on entering the data
     Given user clicks on the sign up button to register
    And user enters usrname "<uName>"
    Then user provide firstname "<fname>"
    Then user provide lastname "<lname>"
    Then user enter all the remaining data

    Examples: 
      | uName    | fname   | lname  |
      | AlexUser0 | mayuriw | chavan |
     

  
  Scenario Outline: login parameterization in testme
  #Given user click on sign in button
    Given user provide the username "<username>"
    When user provide the password "<pswrd>"
    Then user hits the log in button

    Examples: 
      | username | pswrd    |
      | lalitha | password123 |

      
      Scenario: Validating Case Study 3
      Given user searches the required product 
      
      Scenario: Validating Case Study 4
      Given Alex goes to HomePage
      And Alex searches heaphone 
     
 