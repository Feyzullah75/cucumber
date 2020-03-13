@Regression
Feature: This is for web order all products

 @smoke @TC-24
 Scenario: Validation off all product data
  Given The user navigate to the web orders page
  When The user provide the valid username
  And The user provide the valid password
  Then the user click view all products button
  And the user validate product table