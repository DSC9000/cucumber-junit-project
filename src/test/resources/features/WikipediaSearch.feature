Feature: Wikipedia search functionality
  Agile story : As a user ,when i am on wikipedia search page
  I should be able to search for anything and see relevant results
  Background:
    Given  user is on the wikipedia home page
    When user types "Steve Jobs" in the wikipedia search box


    Scenario: Search page title verification
      Then user should see "Steve Jobs" in the wiki  title

    Scenario: search page header verification
      Then user should see "Steve Jobs" in the main  header

    Scenario: search page Image header verification
      Then user should see "Steve Jobs" in the image header