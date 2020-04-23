Feature: Page navigation links
#login as librarian
#click on the users link
  # verify page users

  @wip
  Scenario: Go to users page
    Given I am on the login page
    And I login as a librarian
   # When I click on "Users" link
   # When I click on "Books" link
    When I click on "Users" link
    Then "Users" page should be displayed

  Scenario: Go to books page
    When I click on "Books" link
    Then "Books" page should be displayed

  Scenario: Go to dashboard page
    And I click on "Books" link
    When I click on "Dashboard" link
    Then "Dashboard" page should be displayed



