@HaloChallenge
Feature: Login validations

  Scenario: Login with valid credentials
    Given the user opens the Saucedemo page
    When logs in with valid credentials
    Then the user logs in successfully
    And is redirected to the "Products" section


  Scenario: Login with invalid credentials
    Given the user opens the Saucedemo page
    When logs in with invalid credentials
    Then an error message displays indicating "Username and password do not match any user in this service"


  Scenario: Login with locked out user
    Given the user opens the Saucedemo page
    When logs in with a locked-out user
    Then an error message displays indicating "Sorry, this user has been locked out."
