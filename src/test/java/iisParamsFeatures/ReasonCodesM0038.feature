#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module - ReasonCode maintenance Screen



    Scenario: CRUD testing For ReasonCode Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to ReasonCode Maintenance screen
    And User input ReasonCode and description
    Then Save ReasonCode Details
    And Retrieve Saved ReasonCode details 
    Then Delete ReasonCode Created
    And Close ReasonCode Maintenance Screen


