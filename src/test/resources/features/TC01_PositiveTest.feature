Feature: General Store

  Scenario: TC01 | Positive Test
    When I should select "Austria" in country dropdown
    And I should type "Dan Brown" into name field
    And I should select "Male" as gender
    And I should click on Lets Shop button
    Then I should verify page title "Products" is visible