@Array
Feature: Validating Array operations
	Scenario: sign in in dsalgo portal and entering to Array
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Array
    Then User should see Array Page screen
    When User clicks on Arrays in Python in topics covered
    Then Arrays in Python topic Try here should be visible
    And User click that Arrays in Python Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Arrays in Python") |
    And clicks Run
    
  
	Scenario: sign in in dsalgo portal and entering to Array
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Array
    Then User should see Array Page screen
    When User clicks on Arrays using list in topics covered
    Then Arrays using list topic Try here should be visible
    And User click that Arrays using lists Try here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Arrays using lists") |
    And clicks Run
    
  Scenario: sign in in dsalgo portal and entering to Array
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Array
    Then User should see Array Page screen
    When User clicks on Basic Operations in list in topics covered
    Then Operations in list topic Try here should be visible
    And User click that Operations in listTry here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Basic Operations in list") |
    And clicks Run
    
  Scenario: sign in in dsalgo portal and entering to Array
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of Array
    Then User should see Array Page screen
    When User clicks on Applications of array in topics covered
    Then Applications of array topic Try here should be visible
    And User click that Applications of array in listTry here
    Then User should see tryEditor page
    And enters following code in editor
      | print("This code is for Applications of array") |
    And clicks Run
    
 