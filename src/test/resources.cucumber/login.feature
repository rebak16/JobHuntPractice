# Created by rebak at 2020. 03. 18.

Feature: Login as a new user

  Scenario: Login
    Given Open the Chrome and start application
    When I fill the username field with "<username>"
    And I fill the password field with "<password>"
    And I click on the log in button
    Then I logged in