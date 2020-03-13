@Regression
Feature: Validate of product info

  Background:
    Given The user navigate to the web orders page
    When the user provide username "Tester"
    And the user provide password "test"

    @smoke @TC-23
  Scenario Outline: Validation of Edit Order
    Given the user click edit button
    When the user change customerName "<customerName>"
    Then the user change street "<street>"
    And the user change city "<city>"
    And the user change state "<state>"
    And the user change zip "<zip>"
    When the user click update button
    Then the user validate updated order info "<customerName>" "<street>" "<city>" "<state>" "<zip>"
    Examples:
      | customerName | street           | city         | state | zip   |
      | Muammer      | 2200 E Devon     | Des Plaines  | IL    | 60018 |
      | Arslan       | 2000 Chicago st  | Chicago      | IL    | 60500 |
      | Arslan       | 2000 Chicago st  | Chicago      | IL    | 60500 |
      | Arslan       | 2000 Chicago st  | Chicago      | IL    | 60500 |
      | Arslan       | 2000 Chicago st  | Chicago      | IL    | 60500 |
      | Muhammetali  | 8100 Northway dr | Hanover Park | IL    | 60133 |
