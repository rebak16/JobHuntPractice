# Created by rebak at 2020. 03. 19.

Feature: Add new answer

  Scenario: New answer
    Given Open the Chrome and start application
    When I click on an answer
    And I click on add new answer
    And I fill the field
    And I click on add new answer
    Then I saved a new answer