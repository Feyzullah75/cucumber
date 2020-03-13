@Regression
Feature: Automation Practice

  Background: The user can navigate to the page
    Then the user navigate to automation practice website

    @Smoke
  Scenario Outline: Validation of search
    * the user search with value "<searchValue>"
    * the user validate the of the page "<title>"
    * the user validate search value "<searchResult>"

    Examples:
      | searchValue  | title             | searchResult     |
      | Summer Dress | Search - My Store | \"SUMMER DRESS\" |
      | Dress        | Search - My Store | \"DRESS\"        |
      | shirts       | Search - My Store | \"SHIRTS\"       |


      @Smoke
  Scenario Outline: Validation of search with data table
    * the user search with value "<searchValue>"
    * the user validate the of the page
      |Title|<title>|
    * the user validate search value "<searchResult>"

    Examples:
      | searchValue  | title             | searchResult     |
      | Summer Dress | Search - My Store | \"SUMMER DRESS\" |
      | Dress        | Search - My Store | \"DRESS\"        |
      | shirts       | Search - My Store | \"SHIRTS\"       |

  @docString
  Scenario: This is for doc types
    * the user search with doc types
      """
      Techtorial Academy 2019 summer dress for students for 70 students etc.
      """
