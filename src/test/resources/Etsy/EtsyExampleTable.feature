Feature: Example Table Practice
  Background: This step will navigate Etsy before every scenario
    Given the user navigate to the Etsy

    @TC-4
  Scenario Outline: validate Etsy title after search
    When the user search with "<SearchValue>"
    Then the user validate the "<ExpectedTitle>"
    Examples:
      | SearchValue       | ExpectedTitle             |
      | SearchValue       | ExpectedTitle             |
      | wooden spoon      | Index \| Description      |
      | make up organizer | Make up organizer \| Etsy |
      | sweater           | Sweater \| Etsy           |
      | rose              | Rose \| Etsy              |
      | birthday cake      | Birthday cake \| Etsy    |
      | micrphone         | Microphone \| Etsy        |
      | cable             | Cable \| Etsy             |
      | water bottle      | Water bottle \| Etsy      |
      | mouse             | Mouse \| Etsy             |

    # For Mac user option command+1