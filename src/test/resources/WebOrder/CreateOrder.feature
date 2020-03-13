@Regression
Feature: Creation of new Order

  Background: This will run to login
    Given The user navigate to the web orders page
    When the user provide username "Tester"
    And the user provide password "test"

  @smoke @Test @TC-15
  Scenario Template:
    * The user click order button
    * The user select product "<product>"
    * The user give the quantity "<quantity>"
    When the user change customerName "<customerName>"
    Then the user change street "<street>"
    And the user change city "<city>"
    And the user change state "<state>"
    And the user change zip "<zip>"
    * The user choose the card "<card>"
    And The user provide cardNumber "<cardNumber>"
    But The user enter expiration date "<expire>"
    Then  The user click process button
    And The user click view all orders button
    Then The user validate new order info "<product>" "<quantity>" "<customerName>" "<street>" "<city>" "<state>" "<zip>" "<card>" "<cardNumber>" "<expire>"
    * The user click order button
    Examples:
      | product     | quantity | customerName | street        | city        | state | zip   | card             | cardNumber       | expire |
      | MyMoney     | 10       | Ariet        | 2400 E Bussy  | Mt.Prospect | IL    | 60056 | Visa             | 1111222233334444 | 06/22  |
      | ScreenSaver | 30       | Dmitriy      | 3546 N Arthur | Elmhurt     | IL    | 62345 | MasterCard       | 3333444455556666 | 06/22  |
      | FamilyAlbum | 30       | Baha         | 3546 chicago  | Elmhurt     | IL    | 62345 | American Express | 1122444455556666 | 06/22  |

