Feature: Login with parameters


  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username "librarian11@library"
    And I enter password "I61FFPPf"
    And click the sign in button
    Then dashboard should be displayed

  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "librarian12@library"
    And I enter password "A0YKYTMJ"
    And click the sign in button
    Then dashboard should be displayed
    And there should be 27 users

    @wip2
  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian12@library" and "A0YKYTMJ"
    Then dashboard should be displayed
    And there should be 23 'users'
