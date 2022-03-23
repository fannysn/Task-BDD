Feature: Jobs
  As a user
  I want to find job advertisements from recruiters
  So that I can get information on recommended job vacancies

  Scenario: Search recommended jobs
    Given I am in Jobs page
    When I want more recommendation job for me results
    And click button search jobs
    Then I can find all the result recommended jobs for me

  Scenario: Search jobs by keyword
    Given I am in JobsSearch page
    When I want find recommendation jobs by input keyword skill
    And click icon search
    Then I can find the result recommendation jobs

  Scenario: Search jobs by location
    Given I am in JobsSearch page
    When I want find recommendation jobs by input keyword location
    And click icon search
    Then I can find the result recommendation jobs according the location