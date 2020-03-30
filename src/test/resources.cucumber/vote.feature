# Created by rebak at 2020. 03. 19.
Feature: Vote
  # Enter feature description here

  Scenario: Vote
    Given Open the Chrome and start application
    When I click on vote up
    And I click on vote down
    Then It will increase and decrease