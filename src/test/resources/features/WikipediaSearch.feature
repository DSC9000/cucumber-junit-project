Feature: Wikipedia search functionality
  Agile story : As a user ,when i am on wikipedia search page
  I should be able to search for anything and see relevant results
  @wip
  Scenario: Search page title verification
    Given  user is on the wikipedia home page
    When user types "Steve Jobs" in the wikipedia search box
    Then user should see "Steve Jobs" in the wiki  title


