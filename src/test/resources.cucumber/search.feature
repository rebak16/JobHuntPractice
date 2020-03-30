# Created by rebak at 2020. 03. 19.
Feature: Search
  # Enter feature description here

  Scenario: Search
    Given Open the Chrome and start application
    When I click on search button
    And I fill the field
    Then I see the results