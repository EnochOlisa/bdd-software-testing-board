Feature: Login functionality

  Scenario: User successfully logs in with valid credentials
    Given User is on the login page
    When User enters valid credentials
    When User clicks on the login button
    Then User should be redirected to the homepage with logged-in status
