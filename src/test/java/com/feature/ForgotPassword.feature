
Feature: Forgot Password Functionality

  Background: Given I am on the login page

  Scenario: Navigate to forgot password page
    When I click on the  "Forgot your password?" link
    Then I should be redirected to the password reset page

  Scenario: Request password reset with valid username
    When I click on the  "Forgot your password?" link
    And I enter a valid username "Admin"
    And I click on the "Reset Password" button
    Then I should see a message ""Reset Password link sent successfully"

  Scenario: Request password reset with empty username
    When I click on the  "Forgot your password?" link
    And I leave the username field empty
    And I click on the "Reset Password" button
    Then I should see a message "Required"

  Scenario: Cancel reset password request
    When I click on the  "Forgot your password?" link
    And I enter a valid username "Admin"
    And I click on the cancel button
    Then I should be redirected back to login page

