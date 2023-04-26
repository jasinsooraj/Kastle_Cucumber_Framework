#Author: your.email@your.domain.com
#Keywords Summary :
Feature: IIS Parameters Module - Leased Asset maintenance Screen

  Scenario: CRUD testing For Charge Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to Leased Asset maintenance screen
    And user input Asset code and description
    Then Save Asset Details
    Then Retrieve Asset details
    Then Delete Asset Code Created
    And Close Asset maintenance Screen
