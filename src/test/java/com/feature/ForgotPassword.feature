
Feature: Forgot Password Functionality

  Background: Given I am on the login page

  Scenario: Navigate to forgot password page
    When I click on the  "Forgot your password?" link
    Then I should be redirected to the password reset page
