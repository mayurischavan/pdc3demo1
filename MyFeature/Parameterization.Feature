Feature: my validation on parameterization of DemoWebShop

Background: Launch the site
Given application is launched by user

  Scenario: Validation for registration in DemoWebShop
    
    Then User selects the register button
    When User provides valid data
    And User click on the register button

  Scenario Outline: Validation for login in DemoWebShop
  
    When user provides the username "<uname>"
    And user provides the password "<pswrd>"
  

    Examples: 
      | uname                   | pswrd     |
      | mayuri@gmail.com        |    123456 |
      | sayalidandare@gmail.com | sayali123 |
      | lkm@gmail.com           | lkm123    |
