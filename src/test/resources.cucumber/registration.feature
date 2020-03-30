# Created by rebak at 2020. 03. 19.
Feature: Registration
  # Enter feature description here

  Scenario: Registration
    Given Open the Chrome and start application
    When I fill the first name field with "<firstName>"
    And I fill the last name field with "<lastName>"
    And I fill the email field with "<email>"
    And I fill the username field with "<username>"
    And I fill the password field with "<password>"
    And I fill the confirm password field with "<confirmPassword>"
    And I click on the log in button
    Then I logged in