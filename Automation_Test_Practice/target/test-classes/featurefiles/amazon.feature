Feature: Amazon webpaga automation

  @test_01
  Scenario: Homepage functionality

    When Select the dropdown values
    Then Search the productName "Shirt" in the Searchbar
    And Click the icon button
    And validate the title

