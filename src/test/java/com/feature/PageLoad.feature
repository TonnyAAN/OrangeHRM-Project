Feature: Orange HRM Page Loading

  Background:
    Given I am on the login page

  Scenario Outline: Verify successful loading of <page> page
    When  I enter username "Admin" and password "admin123"
    And the user navigates to the "<page>" page
    Then the "<page>" page should load successfully
    And the page title should be "<expectedUrlPart>"


    Examples:
      | page        | expectedUrlPart                             |
      | Dashboard   | dashboard/index                             |
      | PIM         | pim/viewEmployeeList                        |
      | Leave       | leave/viewLeaveList                         |
      | Time        | time/viewEmployeeTimesheet                  |
      | Recruitment | recruitment/viewCandidates                  |
      | My Info     | viewPersonalDetails/empNumber/7             |
      | Performance | performance/searchEvaluatePerformanceReview |
      | Directory   | directory/viewDirectory                     |
      | Maintenance | maintenance/purgeEmployee                   |
      | Buzz        | buzz/viewBuzz                               |