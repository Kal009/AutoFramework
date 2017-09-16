
Feature: Sign in user scenarios

  @Krishna
  Scenario Outline: valid user should login and see the desired page
    Given user is in home page
    When  user click on login page
    Then  user can see the sign in page
    When  user enter username "<username>" and password "<Password>"
    And   user click on singin botton
    Then  user should can see error message "<error>"


    Examples:
      | username | Password | error |
      |manu1@yahoo.com |somnathji|Uh oh, that password doesn’t match that account. Please try again.|
      |kinji@gmail.com|          |Something's missing.|

  Scenario: regisiter as a new user
    Given user is in home page
    When  user click on login page
    Then  user can see the sign in page