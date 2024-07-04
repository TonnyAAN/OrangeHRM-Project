
Feature: Search Employee
  As an HR manager
  I want to search for employees in the directory
  So that I can view and manage employee information

  Background:
    Given I am on the login page

  Scenario Outline: Search for an employee by name
    When I enter username "Admin" and password "admin123"
    And I navigate to the "Directory" menu
    When I search for an employee by name "<empname>"
    And I select jobtitle for employee "<jobtitle>"
    And I select location  for employee "<location>"
   Then I should see the employee details for "<name>"


    Examples:
      | empname | jobtitle    | location  |  |
      | Rebecca | QA Engineer | Texas R&D |  |

