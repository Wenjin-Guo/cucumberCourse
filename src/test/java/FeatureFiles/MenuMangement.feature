Feature: Menu Management

  @SmokeTest
  Scenario: Add a menu item
    Given I have a menu item with name "cucumber sandwich" and price 20
    When I add that menu item
    Then Menu item with name "cucumber sandwich" should be added

  @RegularTest
  Scenario: Add another menu item
    Given I have a menu item with name "cucumber salad" and price 10
    When I add that menu item
    Then Menu item with name "cucumber salad" should be added

  @NightlyBuildTest @RegularTest
  Scenario: Add third menu item
    Given I have a menu item with name "chicken sandwich" and price 20
    When I add that menu item
    Then Menu item with name "chicken sandwich" should be added