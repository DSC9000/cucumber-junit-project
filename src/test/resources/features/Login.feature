@regression
Feature: Library login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.
  Accounts are: librarian, student, admin

Background:
  Given user is on the login page of the library application
@librarian @smoke
  Scenario: Login as librarian
   # + background step
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
@student @smoke
    Scenario: Login as student

      When user enters student password
      And user enters student username
      Then user should see the dashboard
@admin @smoke
  Scenario: Login as admin

    When user enters admin password
    And user enters admin username
    Then user should see the dashboard
