#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module - Charges maintenance Screen

  Scenario: CRUD testing For Charge Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to charges maintenance screen
    Given user input Charge code and charge description
    Then Save Charge Details
    And Retrieve Saved Charge details 
    Then Delete Charge Code Created
    And Close Charge maintenance Screen


