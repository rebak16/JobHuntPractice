# Created by rebak at 2020. 03. 19.
Feature: List of users

  Scenario: List of users
    Given Open the Chrome and start application
    When I click on list of users
    And Check the users
    Then I see the users