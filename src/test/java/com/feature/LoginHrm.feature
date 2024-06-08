Feature: Orange HRM application login

  Scenario: Login with username and password
    Given I am on the login page
    When I enter username "admin"
    And I enter password "admin123"
    And I click on the login button
    Then I should be logged in successfully


