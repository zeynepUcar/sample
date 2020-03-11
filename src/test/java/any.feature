Feature: Item search
 Scenario Outline: Searching Item
    Given GO tO amazon website
    And Search for "AppleItem"
    When Click on The item
    Then found "AppleItem" Successfully
   Examples:
     |Charger  |
     |Watch  |
     |Airpods  |

