Feature: Fb Login Test
  Scenario: login with valid credentials
    Given I am on facebook Home Page
    When I enter valid user and password
    Then I am on my page