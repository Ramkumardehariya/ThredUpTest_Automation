Feature: Login functionality
  Scenario: Validation of login for practice test automation webpage
    Given User is on login page
    When User Enter the Username as "student"
    And User enter Password as "Password123"
    And click on submit button
