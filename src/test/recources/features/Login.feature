@smoke @lib-100 @login

Feature: Login
  As a user,
  I should be able to login to the application

  @librarian @staff
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed

  @student
  Scenario: Login as an student
    Given I am on the login page
    When I login as a student
    Then dashboard should be displayed

  @admin @staff
  Scenario: Login as an admin
    Given I am on the login page
    When I login as an admin
    Then dashboard should be displayed


#  use this sign for comment
