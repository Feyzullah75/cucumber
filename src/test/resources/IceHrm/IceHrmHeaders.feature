@dataTable
Feature: This is example of data table

  @first @Smoke @TC-7
  Scenario: This scenario for login to the IceHrm
    Given the user navigate to icehrm website
    When the user provide icehrm username "admin"
    Then the user provide icehrm password "admin"
    Then the user click sign in button

  @second @TC-8
  Scenario: Validate of Admin headers
    Then the user should see following headers
      | Dashboard               |
      | Company Structure       |
      | Job Details Setup       |
      | Qualifications Setup    |
      | Projects/Client Setup    |
      | Overtime Administration |
      | Employee Custom Fields  |
      | Company Loans           |

  @TC-1234 @Smoke
  Scenario: Validate of Personal Info headers
    When the user click the personal information
    Then the user should see following personal info headers
      | Dashboard          |
      | Basic Information  |
      | Qualifications      |
      | Dependents         |
      | Emergency Contacts |
