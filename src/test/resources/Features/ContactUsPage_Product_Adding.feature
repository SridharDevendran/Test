Feature: Add product via Contact us page navigation
  
  Scenario: Product adding to cart via Contact Us page
    Given User is in landing page and clicks Contact Us option
    When User clicks Mens shoe
    Then Mens shoe page displays to add product in cart
    And product added in cart