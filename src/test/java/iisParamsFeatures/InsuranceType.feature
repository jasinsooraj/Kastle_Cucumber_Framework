#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module - InsuranceType maintenance Screen



  Scenario: CRUD testing For InsuranceType Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to InsuranceType maintenance screen
    Given user input code and InsuranceType description
    Then Save InsuranceType Details
    And Retrieve Saved InsuranceType details 
    Then Delete InsuranceType Code Created
    And Close InsuranceType maintenance Screen


