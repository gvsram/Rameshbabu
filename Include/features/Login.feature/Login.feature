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
@Loginfeature
Feature: Login
  Test the login functionality of the application
  //WebUI.navigateToUrl('https://www.nopcommerce.com/login.aspx')

  @smoke
  Scenario: Test the login functionality of the application
    Given I navigate to the login page
    And I enter the username as "Rameshbabugvs" and password as "Ramesh123$"
    And I click the login button
    Then I Should see the home page
