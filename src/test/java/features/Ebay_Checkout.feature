Feature: Verify checkout option

  Background: Verify Sign In
    Given Click on sign in hyperlink
    When Enter username
    And Click on continue button
    When Enter password
    And Click on sign in button
    Given Enter item name in search box
    When Click search button
    And Click mobile brand "Apple"
    When Select "1" number item in the list
    And Sliding multiple item image
    When Select item storage capacity
    And Select item color
    When Add item quantity "2"
    Then Check item available or not

  Scenario: Verify checkout option
    Given Click add to cart button
    When Increase item quantity
    And Verity the item price
    When Click go to checkout button
    Then Select payment method paypal









