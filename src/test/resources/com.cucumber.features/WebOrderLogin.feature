Feature: WebOrders login functionality

  Scenario: WebOrders login positive testing 1
    Given The user navigate to the web orders page
    When The user provide the valid username
    And The user provide the valid password
    Then The user should see home page

  Scenario: WebOrders login positive testing 2
    Given The user navigate to the web orders page
    When The user provide the valid username
    And The user provide the valid password
    Then The user should see home page