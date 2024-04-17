Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://www.nike.com/in/"
    And User enters Email as "ruchitachaudhari70@gmail.com" and click on Continue
    And User enters Password as "Ruchita@16091996" and Click on SignIn
    Then I should see the homepage of the Website
    And close Browser