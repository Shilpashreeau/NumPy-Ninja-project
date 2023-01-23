Feature: Stack function after signing in
	@test
  Scenario: sign in in dsalgo portal and entering to Stack
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Stack
    Then User should see Stack Page screen
    When User clicks on Operations in Stack in topics covered
    Then Operations in Stack topic Try here should be visible
    And User click that Operations in Stack Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Operations in Stack") |
    And clicks Run
    
  Scenario: sign in in dsalgo portal and entering to Stack
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Stack
    Then User should see Stack Page screen
    When User clicks on Implementation in Stack in topics covered
    Then Implementation in Stack topic Try here should be visible
    And User click that Implementation in Stack Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Implementation in Stack") |
    And clicks Run
    
   Scenario: sign in in dsalgo portal and entering to Stack
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Stack
    Then User should see Stack Page screen
    When User clicks on Applications in Stack in topics covered
    Then Applications in Stack topic Try here should be visible
    And User click that Applications in Stack Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Applications in stack") |
    And clicks Run