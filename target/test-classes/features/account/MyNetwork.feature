Feature: My Network
  As a user
  I want to manage my network account
  So that I know the people connected with my account

  Scenario: Accepted invitations
    Given I am at MyNetwork page
    When I find a friend invitations from someone
    And click accept button
    Then I got new connections

  Scenario: Ignored invitations
    Given I am at MyNetwork page
    When I find a friend invitations from someone
    And click ignore button
    Then I success canceled the invitations

  Scenario: Connect recommendations friend
    Given I am at MyNetwork page
    When I scrolling down this page
    And click connect button
    Then I can see status pending the connection

  Scenario: Follow recommendations people
    Given I am at MyNetwork page
    When I scrolling down this page
    And click follow button
    Then I can see status following the connection

