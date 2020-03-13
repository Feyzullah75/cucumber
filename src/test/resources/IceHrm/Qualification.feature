@Regression
Feature: Testing Person Qualifications

  Background: This will login to the ICEHRM website
    Given the user navigate to icehrm website
    When the user provide icehrm username "admin"
    Then the user provide icehrm password "admin"
    * the user click sign in button

  @Smoke @TC-10
  Scenario: Validation of Personal Info-Positive
    Given the user click qualification setup button
    Then the user click education tab
    And the user validate personal info displayed
      | Bachelors Degree | Science          |
      | Diploma          | USA              |
      | Masters Degree   | Computer Science |
      | Doctorate        | Management       |

  @Language @Smoke @TC-11
  Scenario: Validation of List of Languages

    Given the user click qualification button
    Then the user click on language button
    And the user validate with short name
      | en         | English   |
      | fr         | French    |
      | de         | German    |
      | zh         | Chinese   |
      | aa         | Afar      |
      | tt         | Abkhaz    |
      | ae         | Avestan   |
      | af         | Afrikaans |
      | ak         | Akan      |
      | am         | Amharic   |
      | an         | Aragonese |
      | ar         | Arabic    |
      | techtorial | Assamese  |
      | av         | Avaric    |
      | ay         | Aymara    |


  @Language1
  Scenario: Validation of List of Languages

    And the user validate languages with short names with header
      | Name       | Description |
      | en         | English     |
      | fr         | French      |
      | de         | German      |
      | zh         | Chinese     |
      | aa         | Afar        |
      | tt         | Abkhaz      |
      | ae         | Avestan     |
      | af         | Afrikaans   |
      | ak         | Akan        |
      | am         | Amharic     |
      | an         | Aragonese   |
      | ar         | Arabic      |
      | techtorial | Assamese    |
      | av         | Avaric      |
      | ay         | Aymara      |


