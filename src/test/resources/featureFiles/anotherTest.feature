Feature: Accounts Test

 @smokeRun
  Scenario: Successfully created an Account
    Given the user navigate to the url
    When the user enters the incorrect username and correct password
    And the user clicks on the login button
    Then an error message pops up