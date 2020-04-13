Feature: Alpha One Amazon Feature

  @amazon
  Scenario Outline: Login to Amazon
    Given user open amazon
    When user enter amazon login credentials "<user>" and "<password>"

    Examples: 
      | user        | password        |
      | amazon_user | amazon_password |
