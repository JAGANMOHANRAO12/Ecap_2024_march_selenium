
Feature: Test Background Feature
Description: The purpouse of this feature is to test the Background keyword

Background: User is Logged In
Given I navigate to the login page
When I submit username and password
Then I should be logged in

Scenario: Search a product and add the first product to the User basket
Given User search for Lenovo 