#@smokeRun
Feature: User Login Tests

  @smokeRun
 Scenario: Successful login with valid credentials
   Given the user navigate to the url
   When the user enters the correct username and password
   And the user clicks on the login button
   Then the user is redirected to the homepage
   And a welcome message is displayed

    @smokeRun @fixingThis
  Scenario: Unsuccessful login with invalid credentials
    Given the user navigate to the url
    When the user enters the incorrect username and password
    And the user clicks on the login button
    Then an error message pops up


  Scenario: Unsuccessful login with invalid username and valid password
    Given the user navigate to the url
    When the user enters the incorrect username and correct password
    And the user clicks on the login button
    Then an error message pops up


  Scenario Outline: Unsuccessful login with invalid username and valid password
    Given the user navigate to the url
    When the user enters the incorrect "<username>" and correct "<password>"
    And the user clicks on the login button
    Then an error message pops up

    Examples: #table
    |username|password|
    |   Admin|admin123|
    |SuperVisor|admin222|

  Scenario:
    Given I query service by "employees"
    When I make the rest call
    Then response should contain:
      """
      {"employees":[
  {"firstName":"John", "lastName":"Doe"},
  {"firstName":"Anna", "lastName":"Smith"},
  {"firstName":"Peter", "lastName":"Jones"}
  ]}
  """

  Scenario Outline: Check for Username and password
    Given I query service by "<firstName>" and "<lastName>"
    When I make the rest call
    Then response should contain "<firstName>" and "<lastName>"

    Examples:
    |firstName|lastName|
    | John  |  Doe   |
    | Anna  |  Smith |
    | Peter |  Jones |
