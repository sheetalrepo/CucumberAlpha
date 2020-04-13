@fk
Feature: Alpha One FK Feature

  Scenario Outline: Purchase an Item from FK
    Given user open flipkart
    When user enter flipkart login credentials "<user>" and "<password>"
    Then user search for 1000 rupee shoes
    Then user purchased and made the payment

    Examples: 
      | user    | password |
      | fk_user | fk_pwd   |
