@Queue
Feature: Queue function after signing in

  Scenario: sign in in dsalgo portal and entering to Queue
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Queue
    Then User should see Queue Page screen
    When User clicks on Implementation of Queue in topics covered
    Then Implementation of Queue topic Try here should be visible
    And User click that Implementation of Queue Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Implementation of Queue") |
    And clicks Run

  Scenario: sign in in dsalgo portal and entering to Queue
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Queue
    Then User should see Queue Page screen
    When User clicks on Implementation of Queue using collection in topics covered
    Then Implementation of Queue using collection topic Try here should be visible
    And User click that Implementation of Queue using collection Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Implementation of Queue using collection") |
    And clicks Run

  Scenario: sign in in dsalgo portal and entering to Queue
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Queue
    Then User should see Queue Page screen
    When User clicks on Implementation of Queue using array in topics covered
    Then Implementation of Queue using array topic Try here should be visible
    And User click that Implementation of array using collection Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Implementation of Queue using array") |
    And clicks Run

  Scenario: sign in in dsalgo portal and entering to Queue
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Queue
    Then User should see Queue Page screen
    When User clicks on Queue operations in topics covered
    Then Queue operations  topic Try here should be visible
    And User click that Queue operations  Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Queue operations ") |
    And clicks Run
