@Regression
Feature: WebOrders login functionality

  @Smoke @TC-18
  Scenario: WebOrders login positive testing 1
    Given The user navigate to the web orders page
    When The user provide the valid username
    And The user provide the valid password
    Then The user should see home page

    @test @TC-19
  Scenario: Web Order login negative testing
    Given The user navigate to the web orders page
    When the user provide username "Test"
    And the user provide password "admin"
    Then the user validate text "Invalid Login or Password"

      @test @TC-20
  Scenario: Web Order login negative with number
    Given The user navigate to the web orders page
    When the user provide username 1234
    And the user provide password 4567
    Then the user validate text "Invalid Login or Password."

        @test @TC-21
  Scenario: Web Order login negative testing 2
    Given The user navigate to the web orders page
    When the user provide username "Tester" and password "tt"
    Then the user validate text "Invalid Login or Password."


          @test @TC-22
  Scenario: WebOrders login positive testing 2
    Given the user validate order menu list
