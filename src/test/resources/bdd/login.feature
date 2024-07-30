Feature: Portal Login

  As a user, I want to be able to log in to the system, so that I can use powerful options

  Scenario: Home page default login
    Given User is on landing page
    When User login into application with correct login and correct password
    Then Home page is visible
    And Cards are displayed

