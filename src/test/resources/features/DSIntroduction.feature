#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Data Structure and Signout
  I want to use this template for my feature file

  @test
  Scenario: Validating functionality of Data structure and signing out from application
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login screen
    When User enters username as "code_warriors" and password as "ssdet@88"
    And click Login button
    Then User should see "You are logged in" msg
    When User clicks on Get started of DataStructure Introduction
    Then User should see DataStructure Introduction
   	When User clicks on Time Complexity in topics covered
   	Then Time Complexity topic Try here should be visible
   	And User click Time Complexity  Try here 
   	Then User should see tryEditor page
    And enters following code in editor
    | print("This code is for Data Structures Time complexity") |
   	And clicks Run
   	Then navigate back
   	And click on Signout

  