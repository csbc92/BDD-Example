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
@tag
Feature: Cash deposit At an ATM. Customer can make a cash deposit using the ATM.
 @tag1
 Scenario: Successful cash deposit
   Given I have an account with a balance of 100
   When I make a deposit of 50 at an ATM
   Then the AtM displays a message that deposit was successful
   And my account has a new balance of 150