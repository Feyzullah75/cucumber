@Regression
Feature: Validation of Salary Component

  @Smoke @TC-12
  Scenario:
    Given the user navigate to icehrm website
    When the user provide icehrm username "admin"
    And the user provide icehrm password "admin"
    Then the user click sign in button

  @test @TC-13
  Scenario Template:
    * the user click the payroll button
    * the user click the salary button
    * the user click the add new button
    * the user enter the code "<code>"
    * the user enter the name "<name>"
    And the user click the save button
    Then the user validate "<code>" and "<name>" are saved
    Scenarios:
      | code | name |
      | 7777 | tttt |
      | 8888 | rrrr |
      | 9999 | qqqq |