Feature: Menu Management
  Scenario: Add a menu item
    Given I have a menu item with name "cucumber sandwich" and price 20
    When I add that menu item
    Then Menu item with name "cucumber sandwich" should be added

