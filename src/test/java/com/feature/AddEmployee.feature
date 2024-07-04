
Feature: Orange HRM Add Employee

  Background:
    Given I am on the login page

  Scenario Outline: Add a new employee
    When I enter username "<username>" and password "<password>"
    And I click on "Add Employee"
    And I enter the following employee details
      | John | Doe | EMP001 |
    Then the employee "John Doe" should be added successfully

    Examples:
      | username | password |
      | Admin    | admin123 |