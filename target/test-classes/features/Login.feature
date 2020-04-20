@smoke

Feature: Login
  As a user,
  I should be able to login to the application

  Scenario: Login as an librarian
    Given I am on the login page
    When I login as admin user
    Then dashboard should be displayed

  Scenario: Login as an student
    Given I am on the login page
    When I login as a student
    Then dashboard should be displayed


#  use this sign for comment
