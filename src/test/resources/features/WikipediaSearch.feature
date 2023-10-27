Feature: Wikipedia search functionality
  Agile story : As a user ,when i am on wikipedia search page
  I should be able to search for anything and see relevant results

  //Background:
  // Given  user is on the wikipedia home page
  // When user types "Steve Jobs" in the wikipedia search box


  Scenario: Search page title verification
    Then user should see "Steve Jobs" in the wiki  title

  Scenario: search page header verification
    Then user should see "Steve Jobs" in the main  header

  Scenario: search page Image header verification
    Then user should see "Steve Jobs" in the image header

  @wiki
  Scenario Outline: Wikipedia search functionality with scenario Outline

    Given  user is on the wikipedia home page
    When user types "<searchValue>" in the wikipedia search box
    Then user should see "<expectedTitle>" in the wiki  title
    Then user should see "<expectedMainHeader>" in the main  header
    Then user should see "<expectedImageHeader>" in the image header

    @ceos
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Marry Barra     | Marry Barra     | Marry Barra        | Marry Barra         |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples:
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Marie Curie     | Marie Curie     | Marie Curie     | Marie Curie     |
      | Albert Einstein | Albert Einstein | Albert Einstein | Albert Einstein |