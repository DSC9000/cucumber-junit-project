Feature: Cucumber Data Tables implementation practices

  Scenario: List of fruits and vegetables I like
    Then user should see below list

      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

    #mac cmd option l (start + alt + L on microsoft keyboard)
  Scenario: User sould be able to see all 12 months in months dropdown
    Given  user is on the dropdown page of practice tool
    Then  user should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |