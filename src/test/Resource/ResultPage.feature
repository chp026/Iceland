Feature:
  Background:
    Given User is on Iceland homepage
    When user checks main menu for special offers
    And user checks for all the special offers
    Then user is on special offers webpage

  Scenario:
    Given user is on special offers webpage
    When user clicks on all £1 products
    Then user should be able to see all the £1 products on offer