#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module - SubPurposeCode maintenance Screen


@CRUD @Regression
    Scenario: CRUD testing For SubPurposeCode Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to SubPurposeCode Maintenance screen
    And User input SubPurposeCode and description
    Then Save SubPurposeCode Details
    And Retrieve Saved SubPurposeCode details 
    Then Delete SubPurposeCode Created
    And Close SubPurposeCode Maintenance Screen


