Feature: Add a product to cart
Scenario: User should able to add a product from store
Given User in store page
When user tries to add a "Blue Shoes" to cart
Then user should see a 1 "Blue Shoes" in the cart