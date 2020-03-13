Feature:Validation of Search in Etsy

  Background: Description
    Given the user navigate to the Etsy
  Scenario: Validation of Wooden Spoon
    When  the user search "Wooden Spoon"
    Then the user validate title "Wooden spoon | Etsy"

  Scenario:Validation of Make up organizer
    When  the user search "Make up organizer"
    Then the user validate title "Make up organizer | Etsy"