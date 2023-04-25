Feature: IIS Parameters Module -Settlement Policy

  Scenario: CURD Testing of Settlement Policy
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    And User Opened Settlement Policy Miantenance OPT
    When User Input Mian Informations and CIF Informations
    And User Save Settlement Policy Data
    And User Retrieve and Delate Data
    Then User validate the outcomes and Close Browser
