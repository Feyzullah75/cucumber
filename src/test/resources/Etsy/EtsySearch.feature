@Regression
Feature: Validate of Search in Etsy

  Background:
    Given the user navigate to the Etsy

    @Smoke @TC-5
  Scenario: Validation of Wooden Spoon
    When the user search "Wooden Spoon"
    Then the user validate title "Wooden spoon | Etsy"

      @TC-6
  Scenario: Validation of Makeup Organizer
    When the user search "Make up Organizer"
    Then the user validate title "Make up organizer | Etsy"