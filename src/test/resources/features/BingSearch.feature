Feature: Bing search functionality
  Agile story : As a user ,when I am on the Bing search page
  I should be abel to search anything and see relevant results

  Scenario: Search result title verification
    Given user is on Bing search page
    When  user enters orange in the Bing  search Box
    Then  user should see orange in the Bing  title


  Scenario: Search result title verification
    Given user is on Bing search page
    When  user enters "orange" in the Bing  search Box
    Then  user should see "orange - Search" in the Bing  title
