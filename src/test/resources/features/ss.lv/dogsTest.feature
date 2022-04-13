@SsLv
  @Dogs
  Feature: Test ss.lv dogs page filtering and validate it

    Scenario:  Open dog page and change price, age and region
      Given Open HomePage
      And Open Dog category
      And Validate that DogPage is open
      When Set min price to 1000 and max price to 0
      And Set min age to 1 and max age to 12
      And Change region to Riga
      Then Press search button
      And Close web-driver






