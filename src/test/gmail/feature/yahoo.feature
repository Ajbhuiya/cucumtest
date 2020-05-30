Feature: Yahoo Search Test

  Scenario: Test yahoo search engine
    Given I am on chrome, I am on www.yahoo.com
    When I search for apples
    Then I am on Apple search Results page