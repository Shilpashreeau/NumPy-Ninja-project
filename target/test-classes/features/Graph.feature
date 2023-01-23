Feature: Graph function after signing in
	@test
  Scenario: sign in in dsalgo portal and entering to Graph
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Graph
    Then User should see Graph Page screen
    When User clicks on Graph in topics covered
    Then Graph topic Try here should be visible
    And User click that Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Graph") |
    And clicks Run
	@test
  Scenario: Graph representation validation
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Graph
    Then User should see Graph Page screen
    When User clicks on Graph Representations in topics covered
    Then Graph Representation topic Try here should be visible
    And User click that Graph Representation Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Graph Represenation") |
    And clicks Run
