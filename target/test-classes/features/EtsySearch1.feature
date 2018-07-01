Feature: Etsy product search

  Scenario: Etsy search for an item
    Given User is on Etsy homepage
    When User searches for "wooden spoon"
    Then Search results should be displayed
