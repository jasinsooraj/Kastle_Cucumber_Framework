#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module - Deviation maintenance Screen



  Scenario: CRUD testing For Deviation Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to deviation maintenance screen
    Given user input code and Deviation description
    Then Save Deviation Details
    And Retrieve Saved Deviation details 
    Then Delete Deviation Code Created
    And Close Deviation maintenance Screen


