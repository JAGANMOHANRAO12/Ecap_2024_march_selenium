
Feature: To Test login functionality
 
  Scenario: To test login functionality with valid data
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user should navigate to homepage