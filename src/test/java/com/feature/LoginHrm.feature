Feature: Orange HRM application login
  Background:
    Given I am on the login page
  Scenario: Login with username and password
    When I enter username "admin"
    And I enter password "admin123"
    And I click on the login button
    Then I should be logged in successfully


  Scenario: Invalid login
    When I enter "invaliduser" and "invalidpass"
    And I click on the login button
    Then I should see an error message "Invalid credentials"