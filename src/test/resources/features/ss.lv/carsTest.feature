@SsLvCars
Feature: Test ss.lv cars page filtering and validate it

  Scenario:  Open cars page and change price, age, engine size and colour
    Given Open HomePage
    And Open Cars category
    And Validate that CarsPage is open
    When Set min price at 6000 and max price at 10000
    And Set min year to 2001
    And Set engine size max 3.0
    And Set colour white
    Then Press search button
    And Close web-driver