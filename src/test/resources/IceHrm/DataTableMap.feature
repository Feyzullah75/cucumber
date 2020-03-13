@dataTable
Feature: This is example of data map value

  @smoke @test1 @TC-007
  Scenario: Validation of data table
    When the user gives the personal information
      |firstname  | muammer   |
      |lastname   | turan     |
      |city       | Chicago   |
      |phoneNumber| 2223334444|
    Given  the user print name
