Feature: Salary Calculator
  As an accountant
  I need to calculate the tax of the salary
  So that I can calculate the the net salary.
  UseCase 2
  UseCase 3

  Background:
    Given I am logged into the system

  Scenario: Calculate the gross salary
    When I add basic salary "1500"
    And  I add allwance one "300"
    Then I should get the Gross salary "1800"

  Scenario: Calcualte the Net Salary
    Given the tax rate is "10" percent
    When I add basic salary "1500"
    And  I add allwance oncce "300"
    Then I should get the tax deduction "180"
    Then I should get a net salary "1620"
    Then I should get the tax deduction "<string>"