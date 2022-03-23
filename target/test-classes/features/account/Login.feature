Feature: Login
  As a user
  I want to login
  So that I can access my homepage at Linkedin

  Scenario: Success login
    Given I am at login page
    When I fill valid username or phone and password
    And click sign in button
    Then I successfully login to homepage

  Scenario: Failed login
    Given I am at login page
    When I fill invalid username or phone and valid password
    And click sign in button
    Then I will get error message

  Scenario: Failed login
    Given I am at login page
    When I fill valid username or phone and invalid password
    And click sign in button
    Then I will get error message

  Scenario: Failed login
    Given I am at login page
    When I fill invalid username or phone and invalid password
    And click sign in button
    Then I will get error message
