Feature: etsy search functionality verification
  Agile Story : User should be able to type any keyword and see relevant info

  Scenario: etsy title verification
    Given user is on Etsy homepage
    Then user should see title is as expected
    # expectedTitle: "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"

  Scenario:  Etsy Search Functionality Title Verification (W/O parameterization)
    Given user is on Etsy homepage
    When  user types Wooden Spoon in the search box
    And   user click the Etsy search button
    Then  user sees Wooden Spoon int the title

  Scenario:  Etsy Search Functionality Title Verification (W parameterization)
    Given user is on Etsy homepage
    When  user types "Wooden Spoon" in the search box
    And   user click the Etsy search button
    Then  user sees "Wooden spoon - Etsy" in the title