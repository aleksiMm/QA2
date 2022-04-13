@SmokeTest
@WIP
@Wip
@Jira-19234
Feature: I will test something here

  Background:
    Given Did something before all of this

  @ScenarioTag
  Scenario: Will do something here
    Given Do something
    And Do something more
    When Change something
    And Change something else
    Then Something happened

  Scenario Outline: Do some tests here
    Given Start do<startWordAction>
    When Change<changeWordAction>
    Then  <resultWordAction>

    Examples:
      | startWordAction | changeWordAction | resultWordAction |
      | something       | something        | something        |
      | anything        | anything         | anything         |