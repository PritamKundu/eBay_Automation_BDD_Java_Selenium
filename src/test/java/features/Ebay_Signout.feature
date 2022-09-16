Feature: Verify Ebay Sign Out

  Background:Verify Sign In
    Given Click on sign in hyperlink
    When Enter username
    And Click on continue button
    When Enter password
    And Click on sign in button

  Scenario: Verify Sign out
    Given Click on profile
    Then Click sign out


