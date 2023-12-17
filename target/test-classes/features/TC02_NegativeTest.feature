Feature: General Store

  Scenario: TC02 | Negative Test
    When I should select "Belgium" in country dropdown
    And I should leave name field empty
    And I should select "Female" as gender
    And I should click on Lets Shop button
    Then I should verify error message "Please enter your name" is visible