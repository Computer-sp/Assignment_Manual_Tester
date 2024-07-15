Feature: Login

  Scenario Outline: Login with valid credentials
    Given I am on the login page
    When I enter "<username>" and "<password>"
    And I click the login button
    Then I should see the dashboard

  Examples:
    | username | password  |
    | user1    | password1 |
    | user2    | password2 |
