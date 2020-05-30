Feature: Amazon Search Test
  Scenario: Search for an item
    Given I am on Firefox and on www.Amazon.com
    When I search for apples
    Then I am on Apple search Results page