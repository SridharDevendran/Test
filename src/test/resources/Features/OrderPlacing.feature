Feature: Order Placing
  Scenario: Place the order with billing details
    Given User is in cart page
    When user places a order with billing details  
      | firstname | lastname   | country_region | street_address 		 | town_city| state   	 | zip	 |emailaddress			  |
      | Sridhar 	|  Devendran | India 					| 234, spring street | plane    | Tamil Nadu | 23456 |test123cucu@test.com|
    Then order is placed
