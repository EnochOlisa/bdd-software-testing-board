Feature: Login functionality

  Scenario: User successfully logs in with valid credentials
    Given User is on the login page
    When User enters valid credentials
    When User clicks on the login button
    Then User should be redirected to the homepage with logged-in status

  Scenario: User fails to log in with invalid credentials
    Given User is on the login page
    When User enters invalid credentials
    When User clicks on the login button
    Then User should see an error message indicating invalid credentials

  Scenario: User attempts to log in with empty credentials
    Given User is on the login page
    When User leaves the username and password fields empty
    When User clicks on the login button
    Then User should see an error message indicating that fields cannot be empty
