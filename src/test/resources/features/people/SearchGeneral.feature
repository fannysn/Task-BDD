Feature: Search General
  As a user
  I want to search relevant job with my education background
  So that I can find suitable job options

  Scenario: Success show result by job positions
    Given I am in Homepage
    When I type valid keywords job positions
    And click icon search
    Then I can find all the result hiring job that i wont

  Scenario: Search by suggested keywords
    Given I am in Homepage
    When I choose one of the keyword suggestions
    And click icon search
    Then I can find all the result that i wont

  Scenario: Failed show result
    Given I am in Homepage
    When I type Invalid keywords
    And click icon search
    Then I can't see the result