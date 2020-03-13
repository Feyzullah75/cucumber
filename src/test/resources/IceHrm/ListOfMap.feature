@Regression
Feature: This is the validation of Project Client Setup

  Background: This will login to the ICEHRM website
    Given the user navigate to icehrm website
    When the user provide icehrm username "admin"
    Then the user provide icehrm password "admin"
    * the user click sign in button

    @Smoke @TC-9
  Scenario: This is the validation of Client Info
    Given the user click project client setup button
    Then the user validate client info
      | Icehrm Sample Client 1 | 001, Sample Road, Sample City, USA | 678-894-1047   |
      | Icehrm Sample Client 2 | 001, Sample Road, Sample City, USA | 678-894-1047   |
      | Icehrm Sample Client 3 | 001, Sample Road, Sample City, USA | 678-894-1047   |
