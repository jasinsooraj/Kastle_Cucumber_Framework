Feature: Yeild-Yeild Roster

  Scenario: CURD Testing of Yeild Roster
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    And User Click on Yeild Roster Maintenance OPT
    When User Input Main and Roster Details
    Then User Save Roster Details
    And User Retrieve Saved Data
    Then User Delete Roster Details
